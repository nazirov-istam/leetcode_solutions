package com.example.leetcode_solutions.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem811 {
    public static void main(String[] args) {
        System.out.println(subdomainVisits(new String[]{
                "900 google.mail.com",
                "50 yahoo.com",
                "1 intel.mail.com",
                "5 wiki.org",
                "901 mail.com",
                "50 yahoo.com",
                "900 google.mail.com",
                "5 wiki.org",
                "5 org",
                "1 intel.mail.com",
                "951 com"}));
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> domainCount = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] parts = cpdomain.split(" ");
            int count = Integer.parseInt(parts[0]);
            String[] subdomains = parts[1].split("\\.");

            StringBuilder subdomain = new StringBuilder();
            for (int i = subdomains.length - 1; i >= 0; i--) {
                if (!subdomain.isEmpty()) {
                    subdomain.insert(0, ".");
                }
                subdomain.insert(0, subdomains[i]);
                domainCount.put(subdomain.toString(), domainCount.getOrDefault(subdomain.toString(), 0) + count);
            }
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : domainCount.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }

        return result;
    }
}
