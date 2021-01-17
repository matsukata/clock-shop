package com.shop.view;

import com.shop.model.Watches;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WatchesOutput implements View {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        @Override
        public void showWatches(Watches watches) {
            System.out.println("Введите один из параметров для сортировки. Мужские/женские. Япония/Германия/Италия. ");
            while (true) {
                String line = null;
                try {
                    line = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (line.isEmpty()) {
                    break;
                } else {

                    if (watches.getSex().equals(line)) {
                        System.out.println(watches);
                    }
                    if (watches.getBrand().equals(line)) {
                        System.out.println(watches);
                    }
                    if (watches.getCountryOfOrigin().equals(line)) {
                        System.out.println(watches);
                    }
                    if (watches.getStyle().equals(line)) {
                        System.out.println(watches);
                    }
                    if (watches.getGlassMaterial().equals(line)) {
                        System.out.println(watches);
                    }
                }
            }
        }
    }

