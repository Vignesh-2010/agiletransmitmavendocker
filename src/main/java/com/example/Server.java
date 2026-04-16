package com.example;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started on port 5000");

        Socket socket = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String message = in.readLine();
        System.out.println("Received: " + message);

        socket.close();
        serverSocket.close();
    }
}