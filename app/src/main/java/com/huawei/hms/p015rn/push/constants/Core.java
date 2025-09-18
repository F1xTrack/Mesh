package com.huawei.hms.p015rn.push.constants;

/* loaded from: classes.dex */
public interface Core {
    public static final String CLIENT_APP_ID = "client/app_id";
    public static final String DEFAULT_MESSAGE = "HMS Push";
    public static final String DEFAULT_TOKEN_SCOPE = "HCM";
    public static final long DEFAULT_VIBRATE_DURATION = 250;
    public static final String NOTIFICATION_CHANNEL_DESC = "Huawei HMS Push";
    public static final String NOTIFICATION_CHANNEL_ID = "huawei-hms-rn-push-channel-id";
    public static final String NOTIFICATION_CHANNEL_NAME = "huawei-hms-rn-push-channel";
    public static final String PREFERENCE_NAME = "huawei_hms_rn_push";
    public static final String RAW = "raw";
    public static final String REMOTE_MESSAGE_UPLINK_TO = "push.hcm.upstream";

    public interface Event {
        public static final String LOCAL_NOTIFICATION_ACTION_EVENT = "LOCAL_NOTIFICATION_ACTION_EVENT";
        public static final String NOTIFICATION_OPENED_EVENT = "NOTIFICATION_OPENED_EVENT";
        public static final String ON_MULTI_SENDER_TOKEN_ERROR_EVENT = "ON_MULTI_SENDER_TOKEN_ERROR_EVENT";
        public static final String ON_MULTI_SENDER_TOKEN_RECEIVED_EVENT = "ON_MULTI_SENDER_TOKEN_RECEIVED_EVENT";
        public static final String ON_PUSH_MESSAGE_SENT = "ON_PUSH_MESSAGE_SENT";
        public static final String ON_PUSH_MESSAGE_SENT_DELIVERED = "ON_PUSH_MESSAGE_SENT_DELIVERED";
        public static final String ON_PUSH_MESSAGE_SENT_ERROR = "ON_PUSH_MESSAGE_SENT_ERROR";
        public static final String ON_TOKEN_ERROR_EVENT = "ON_TOKEN_ERROR_EVENT";
        public static final String ON_TOKEN_RECEIVED_EVENT = "ON_TOKEN_RECEIVED_EVENT";
        public static final String PUSH_ON_START_COMMAND_EVENT = "PUSH_ON_START_COMMAND_EVENT";
        public static final String REMOTE_DATA_MESSAGE_RECEIVED = "REMOTE_DATA_MESSAGE_RECEIVED";
        public static final String REMOTE_NOTIFICATION_RECEIVED = "REMOTE_NOTIFICATION_RECEIVED";

        public interface Result {
            public static final String DATA_JSON = "dataJSON";
            public static final String EXCEPTION = "exception";
            public static final String MSG = "msg";
            public static final String MSG_ID = "msgId";
            public static final String ON_START_COMMAND = "COMMAND_START";
            public static final String RESULT = "result";
            public static final String RESULT_CODE = "resultCode";
            public static final String RESULT_INFO = "resultInfo";
            public static final String TOKEN = "token";
        }
    }

    public interface NotificationType {
        public static final String DATA = "DATA";
        public static final String NOW = "NOW";
        public static final String REMOTE = "REMOTE";
        public static final String SCHEDULED = "SCHEDULED";
    }

    public interface Resource {
        public static final String DEFAULT = "default";
        public static final String LAUNCHER = "ic_launcher";
        public static final String MIPMAP = "mipmap";
        public static final String NOTIFICATION = "ic_notification";
    }

    public interface ScheduledPublisher {
        public static final String BOOT_EVENT = "android.intent.action.BOOT_COMPLETED";
        public static final String NOTIFICATION_ID = "notificationId";
    }
}
