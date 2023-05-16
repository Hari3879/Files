package com.ojas.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Game {
    private ExecutorService executor;
    private Player player;
    private Enemy enemy;
    
    public Game() {
        executor = Executors.newFixedThreadPool(2);
        player = new Player();
        enemy = new Enemy();
    }
    
    public void start() {
        executor.execute(player);
        executor.execute(enemy);
    }
    
    public void stop() {
        executor.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private class Player implements Runnable {
        @Override
        public void run() {
            while (true) {
                // player logic here
            }
        }
    }
    
    private class Enemy implements Runnable {
        @Override
        public void run() {
            while (true) {
                // enemy logic here
            }
        }
    }
}