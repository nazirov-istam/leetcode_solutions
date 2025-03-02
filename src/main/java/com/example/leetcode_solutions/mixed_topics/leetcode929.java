package com.example.leetcode_solutions.mixed_topics;

import java.util.HashSet;
import java.util.Set;

public class leetcode929 {
    public static void main(String[] args) {
        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode2597.com","test.e.mail+bob.cathy@leetcode2597.com","testemail+david@lee.tcode.com"}));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails) {
            int atIndex = email.indexOf('@');
            if (atIndex != -1) {
                String local = email.substring(0, atIndex).split("\\+")[0].replace(".", "");
                String domain = email.substring(atIndex);
                uniqueEmails.add(local + domain);
            }
        }
        return uniqueEmails.size();
    }
}
