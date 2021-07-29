package com.proba;

import java.io.*;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8000);
             //создаем сокет с именем хоста и номером порта(как на сервере)
             BufferedReader in = new BufferedReader(new InputStreamReader(
                             socket.getInputStream()));
             //открываем входящий поток для принятия ответов с сервера
             BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
                             socket.getOutputStream()))) {
            //открываем исходящий поток, чтоб передавать сообщения серверу

            out.write("Hello, it's a client!"); //передаем сообщение серверу
            out.newLine(); //переход на новую строку
            out.flush(); //отправляем запрос окончательно
            String word = in.readLine(); //принимаем ответ от сервера
            System.out.println("Server: " + word); //выводим в консоль ответ
        } catch (IOException e) {
            e.printStackTrace();
        }
        //закрывать потоки и сокет в ручную не надо, т.к. они объявлены в блоке
        //"try с ресурсами" и закроются автоматически
    }

}
