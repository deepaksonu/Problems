package com.deepak.problems.leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqEmailAddress {

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }


    public static int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<>();
        for (String email : emails) {
            boolean afterAt = false;
            boolean afterPLus=false;
            String s = "";
            for(int i = 0; i< email.length() -1; i++ ){
                if(email.charAt(i) == '@'){
                    afterAt = true;
                    s =s + email.charAt(i);
                    continue;
                }
                if(email.charAt(i) == '+'){
                    afterPLus = true;
                    continue;
                }
                if(!afterAt && email.charAt(i) == '.'){
                    continue;
                }
                if(afterPLus && !afterAt){
                    continue;
                }
                s = s + email.charAt(i);
            }
            emailSet.add(s);
        }
        return emailSet.size();
    }
}
