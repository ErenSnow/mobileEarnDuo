package vicmob.micropowder.daoman.bean;

/**
 * Created by qq944 on 2017/9/29.
 */

public class DefaultDataBean {


    /**
     * body : {"lzUsescid":{"accounts":1,"addPeopleNum":3,"addTime":1516511786000,"address":"","applicationId":1,"autoSendContent":"自动回复66","commentContent":"评论66","commentNum":10,"driftBottleContent":"漂流瓶66","driftBottleNum":3,"groups":1,"isNewRecord":true,"isNewRecordCustomId":false,"mid":1,"nearbyPeopleNum":3,"password":"","pushAccounts":1,"pushfriends":3,"qqAkeyContent":"QQ消息","qqFriendNum":10,"qqGroupfriendNum":1,"qqNearbyContent":"QQ打招呼","qqNearbyNum":10,"sendMsgContent":"打招呼666","sid":10,"useScid":"1d30d5097d34","userid":1,"username":""}}
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
         * lzUsescid : {"accounts":1,"addPeopleNum":3,"addTime":1516511786000,"address":"","applicationId":1,"autoSendContent":"自动回复66","commentContent":"评论66","commentNum":10,"driftBottleContent":"漂流瓶66","driftBottleNum":3,"groups":1,"isNewRecord":true,"isNewRecordCustomId":false,"mid":1,"nearbyPeopleNum":3,"password":"","pushAccounts":1,"pushfriends":3,"qqAkeyContent":"QQ消息","qqFriendNum":10,"qqGroupfriendNum":1,"qqNearbyContent":"QQ打招呼","qqNearbyNum":10,"sendMsgContent":"打招呼666","sid":10,"useScid":"1d30d5097d34","userid":1,"username":""}
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
             * accounts : 1
             * addPeopleNum : 3
             * addTime : 1516511786000
             * address :
             * applicationId : 1
             * autoSendContent : 自动回复66
             * commentContent : 评论66
             * commentNum : 10
             * driftBottleContent : 漂流瓶66
             * driftBottleNum : 3
             * groups : 1
             * isNewRecord : true
             * isNewRecordCustomId : false
             * mid : 1
             * nearbyPeopleNum : 3
             * password :
             * pushAccounts : 1
             * pushfriends : 3
             * qqAkeyContent : QQ消息
             * qqFriendNum : 10
             * qqGroupfriendNum : 1
             * qqNearbyContent : QQ打招呼
             * qqNearbyNum : 10
             * sendMsgContent : 打招呼666
             * sid : 10
             * useScid : 1d30d5097d34
             * userid : 1
             * username :
             */

            private int accounts;
            private int addPeopleNum;
            private long addTime;
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
            private int mid;
            private int nearbyPeopleNum;
            private String password;
            private int pushAccounts;
            private int pushfriends;
            private String qqAkeyContent;
            private int qqFriendNum;
            private int qqGroupfriendNum;
            private String qqNearbyContent;
            private int qqNearbyNum;
            private String sendMsgContent;
            private int sid;
            private String useScid;
            private int userid;
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

            public long getAddTime() {
                return addTime;
            }

            public void setAddTime(long addTime) {
                this.addTime = addTime;
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

            public int getMid() {
                return mid;
            }

            public void setMid(int mid) {
                this.mid = mid;
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

            public String getQqAkeyContent() {
                return qqAkeyContent;
            }

            public void setQqAkeyContent(String qqAkeyContent) {
                this.qqAkeyContent = qqAkeyContent;
            }

            public int getQqFriendNum() {
                return qqFriendNum;
            }

            public void setQqFriendNum(int qqFriendNum) {
                this.qqFriendNum = qqFriendNum;
            }

            public int getQqGroupfriendNum() {
                return qqGroupfriendNum;
            }

            public void setQqGroupfriendNum(int qqGroupfriendNum) {
                this.qqGroupfriendNum = qqGroupfriendNum;
            }

            public String getQqNearbyContent() {
                return qqNearbyContent;
            }

            public void setQqNearbyContent(String qqNearbyContent) {
                this.qqNearbyContent = qqNearbyContent;
            }

            public int getQqNearbyNum() {
                return qqNearbyNum;
            }

            public void setQqNearbyNum(int qqNearbyNum) {
                this.qqNearbyNum = qqNearbyNum;
            }

            public String getSendMsgContent() {
                return sendMsgContent;
            }

            public void setSendMsgContent(String sendMsgContent) {
                this.sendMsgContent = sendMsgContent;
            }

            public int getSid() {
                return sid;
            }

            public void setSid(int sid) {
                this.sid = sid;
            }

            public String getUseScid() {
                return useScid;
            }

            public void setUseScid(String useScid) {
                this.useScid = useScid;
            }

            public int getUserid() {
                return userid;
            }

            public void setUserid(int userid) {
                this.userid = userid;
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
