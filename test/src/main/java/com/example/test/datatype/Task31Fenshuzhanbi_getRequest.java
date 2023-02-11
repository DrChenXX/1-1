package com.example.test.datatype;

public class Task31Fenshuzhanbi_getRequest {
        private String courseid;

        public Task31Fenshuzhanbi_getRequest() {
        }

        public Task31Fenshuzhanbi_getRequest(String kechengid) {
            this.courseid = kechengid;
        }

        public String getCourseid() {
            return courseid;
        }

        @Override
        public String toString() {
            return "SearchKaohefangshiRequest{" +
                    "searchKaohefangshiRequest='" + courseid + '\'' +
                    '}';
        }
}
