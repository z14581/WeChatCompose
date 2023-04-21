package com.zqc.wechatcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
 import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.zqc.wechatcompose.ui.theme.WeChatComposeTheme


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var viewModel:WeViewModel = viewModel()

            WeChatComposeTheme {
                Column() {
                    Text(viewModel.name)

                    Button(onClick = {
                        viewModel.name = "1232131"
                    }) {
                        Text("更新数据  tusong")
                    }
                }
            }
        }

    }
}

@Composable
fun WeBottomBar(slect:Int){

    var viewModel:WeViewModel = viewModel()

    Row() {
        TabItem(if (slect == 0) R.drawable.ic_chat_filled else R.drawable.ic_chat_outlined, title = "聊天",Modifier.weight(1f))
        TabItem(if (slect == 1) R.drawable.ic_contacts_filled else R.drawable.ic_contacts_outlined, title = "通讯录",Modifier.weight(1f))
        TabItem(if (slect == 2) R.drawable.ic_discovery_filled else R.drawable.ic_discovery_outlined, title = "发现",Modifier.weight(1f))
        TabItem(if (slect == 3) R.drawable.ic_me_filled else R.drawable.ic_me_outlined, title = "我",Modifier.weight(1f))

    }
}

@Composable
fun TabItem(@DrawableRes iconId:Int,title:String,modifier: Modifier = Modifier){
    Column(modifier.padding(vertical = 8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(painterResource(id = iconId) ,   title,Modifier.size(24.dp))
        Text(title, fontSize = 12.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun preview(){
    Text("sssx  x xs")

    var c:WeViewModel = viewModel()
//    var list = mutableListOf("11","22","33","44","55","66","77","88")
//
//
//    LazyColumn(){
//        items(list){ name->
//            Text(text = "列表   $name")
//        }
//    }





}

