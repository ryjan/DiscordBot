package org.discord.program;


import org.discord.misc.Misc;

public class Program {

    public static void main(String[] args) {
        String message = Misc.getConnectionString();
        System.out.println(message);
    }
}