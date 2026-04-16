package com.example;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5000);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Hello from Client");

        socket.close();
    }
}