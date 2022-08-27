package com.code;

public enum DayOfWeek {
    MONDAY(){
        @Override
        public String toString() {
            return "Дуйшөмбү күнү жава окуйм";
        }
    },
    TUESDAY(){
        @Override
        public String toString() {
            return "Шейшемби күнү практика окуйм";
        }
    },
    WEDNESDAY(){
        @Override
        public String toString() {
            return "Шаршемби күнү жава окуйм";
        }
    },
    THURSDAY(){
        @Override
        public String toString() {
            return "Бейшемби күнү пркатика окуйм";
        }
    },
    FRIDAY(){
        @Override
        public String toString() {
            return "Жума күнү жава окуйм";
        }
    },
    SATURDAY(){
        @Override
        public String toString() {
            return "Ишемби күнү окуу жок";
        }
    },
    SUNDAY(){
        @Override
        public String toString() {
            return "Жекшемби күнү окуу жок";
        }
    }
}
