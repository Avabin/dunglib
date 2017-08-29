package tk.avabin.dunglib.server.beans.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @RequestMapping(value = "/hello", method = arrayOf(RequestMethod.GET))
    fun hello(): String {
        return "hello world"
    }
}