package com.example.session5

object Connection{
    const val url = "WS"
    val client = object :WebSOcketClient(URI("${url}/chats"), mapOf("idUser" to 6){

    }
}
interface Callbacks{
    fun onOpen()
    fun onMessage(modelMessage:ModelMessage)
    fun onChat()
    fun onChats()
    fun onPerson()
}