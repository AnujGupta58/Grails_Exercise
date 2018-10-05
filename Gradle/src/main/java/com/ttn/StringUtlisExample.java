package com.ttn;


import org.apache.commons.lang3.StringUtils;

public class StringUtlisExample
{
        public static void main(String[] args) {
            System.out.println("7) Join Strings using separator >>>" +
                    StringUtils.join(new String[] { "AB", "CD", "EF" }, "YES"));
        }
    }
