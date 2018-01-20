package vicmob.micropowder.daoman.bean;

/**
 * Created by qq944 on 2017/9/29.
 */

public class DefaultDataBean {


    /**
     * body : {"lzUsescid":{"accounts":2,"addPeopleNum":20,"address":"浙江杭州","applicationId":1,"autoSendContent":"你好，能认识你很高兴，请添加一下！","commentContent":"30","commentNum":2,"driftBottleContent":"你好，认识你真的很好！","driftBottleNum":5,"groups":5,"isNewRecord":true,"isNewRecordCustomId":false,"nearbyPeopleNum":20,"password":"so123456","pushAccounts":2,"pushfriends":10,"sendMsgContent":"你好，能认识你真的很好，请添加一下！","useScid":"9f4b9a2a7d14","username":"18258208914"}}
     * errorCode : -1
     * msg : 操作成功
     * success : true
     */

    private BodyBean body;
    private String errorCode;
    private String msg;
    private boolean success;

    public BodyBean getBody() {
        return body;
    }

    public void setBody(BodyBean body) {
        this.body = body;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class BodyBean {
        /**
         * lzUsescid : {"accounts":2,"addPeopleNum":20,"address":"浙江杭州","applicationId":1,"autoSendContent":"你好，能认识你很高兴，请添加一下！","commentContent":"30","commentNum":2,"driftBottleContent":"你好，认识你真的很好！","driftBottleNum":5,"groups":5,"isNewRecord":true,"isNewRecordCustomId":false,"nearbyPeopleNum":20,"password":"so123456","pushAccounts":2,"pushfriends":10,"sendMsgContent":"你好，能认识你真的很好，请添加一下！","useScid":"9f4b9a2a7d14","username":"18258208914"}
         */

        private LzUsescidBean lzUsescid;

        public LzUsescidBean getLzUsescid() {
            return lzUsescid;
        }

        public void setLzUsescid(LzUsescidBean lzUsescid) {
            this.lzUsescid = lzUsescid;
        }

        public static class LzUsescidBean {
            /**
             * accounts : 2
             * addPeopleNum : 20
             * address : 浙江杭州
             * applicationId : 1
             * autoSendContent : 你好，能认识你很高兴，请添加一下！
             * commentContent : 30
             * commentNum : 2
             * driftBottleContent : 你好，认识你真的很好！
             * driftBottleNum : 5
             * groups : 5
             * isNewRecord : true
             * isNewRecordCustomId : false
             * nearbyPeopleNum : 20
             * password : so123456
             * pushAccounts : 2
             * pushfriends : 10
             * sendMsgContent : 你好，能认识你真的很好，请添加一下！
             * useScid : 9f4b9a2a7d14
             * username : 18258208914
             */

            private int accounts;
            private int addPeopleNum;
            private String address;
            private int applicationId;
            private String autoSendContent;
            private String commentContent;
            private int commentNum;
            private String driftBottleContent;
            private int driftBottleNum;
            private int groups;
            private boolean isNewRecord;
            private boolean isNewRecordCustomId;
            private int nearbyPeopleNum;
            private String password;
            private int pushAccounts;
            private int pushfriends;
            private String sendMsgContent;
            private String useScid;
            private String username;

            public int getAccounts() {
                return accounts;
            }

            public void setAccounts(int accounts) {
                this.accounts = accounts;
            }

            public int getAddPeopleNum() {
                return addPeopleNum;
            }

            public void setAddPeopleNum(int addPeopleNum) {
                this.addPeopleNum = addPeopleNum;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public int getApplicationId() {
                return applicationId;
            }

            public void setApplicationId(int applicationId) {
                this.applicationId = applicationId;
            }

            public String getAutoSendContent() {
                return autoSendContent;
            }

            public void setAutoSendContent(String autoSendContent) {
                this.autoSendContent = autoSendContent;
            }

            public String getCommentContent() {
                return commentContent;
            }

            public void setCommentContent(String commentContent) {
                this.commentContent = commentContent;
            }

            public int getCommentNum() {
                return commentNum;
            }

            public void setCommentNum(int commentNum) {
                this.commentNum = commentNum;
            }

            public String getDriftBottleContent() {
                return driftBottleContent;
            }

            public void setDriftBottleContent(String driftBottleContent) {
                this.driftBottleContent = driftBottleContent;
            }

            public int getDriftBottleNum() {
                return driftBottleNum;
            }

            public void setDriftBottleNum(int driftBottleNum) {
                this.driftBottleNum = driftBottleNum;
            }

            public int getGroups() {
                return groups;
            }

            public void setGroups(int groups) {
                this.groups = groups;
            }

            public boolean isIsNewRecord() {
                return isNewRecord;
            }

            public void setIsNewRecord(boolean isNewRecord) {
                this.isNewRecord = isNewRecord;
            }

            public boolean isIsNewRecordCustomId() {
                return isNewRecordCustomId;
            }

            public void setIsNewRecordCustomId(boolean isNewRecordCustomId) {
                this.isNewRecordCustomId = isNewRecordCustomId;
            }

            public int getNearbyPeopleNum() {
                return nearbyPeopleNum;
            }

            public void setNearbyPeopleNum(int nearbyPeopleNum) {
                this.nearbyPeopleNum = nearbyPeopleNum;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public int getPushAccounts() {
                return pushAccounts;
            }

            public void setPushAccounts(int pushAccounts) {
                this.pushAccounts = pushAccounts;
            }

            public int getPushfriends() {
                return pushfriends;
            }

            public void setPushfriends(int pushfriends) {
                this.pushfriends = pushfriends;
            }

            public String getSendMsgContent() {
                return sendMsgContent;
            }

            public void setSendMsgContent(String sendMsgContent) {
                this.sendMsgContent = sendMsgContent;
            }

            public String getUseScid() {
                return useScid;
            }

            public void setUseScid(String useScid) {
                this.useScid = useScid;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }
        }
    }
}
