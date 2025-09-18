package com.huawei.hms.p015rn.push.utils;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.p015rn.push.constants.Core;
import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import com.huawei.hms.p015rn.push.constants.ResultCode;
import com.huawei.hms.push.RemoteMessage;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class RemoteMessageUtils {
    private RemoteMessageUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static HashMap<String, Object> toMap(RemoteMessage remoteMessage) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("collapseKey", remoteMessage.getCollapseKey());
        map.put("data", remoteMessage.getData());
        map.put(RemoteMessageAttributes.DATA_OF_MAP, remoteMessage.getDataOfMap() + "");
        map.put(RemoteMessageAttributes.MESSAGE_ID, remoteMessage.getMessageId());
        map.put(RemoteMessageAttributes.MESSAGE_TYPE, remoteMessage.getMessageType());
        map.put(RemoteMessageAttributes.ORIGINAL_URGENCY, remoteMessage.getOriginalUrgency() + "");
        map.put("urgency", remoteMessage.getUrgency() + "");
        map.put("ttl", remoteMessage.getTtl() + "");
        map.put(RemoteMessageAttributes.SENT_TIME, remoteMessage.getSentTime() + "");
        map.put("to", remoteMessage.getTo());
        map.put("from", remoteMessage.getFrom());
        map.put("token", remoteMessage.getToken());
        map.put("receiptMode", remoteMessage.getReceiptMode() + "");
        map.put("sendMode", remoteMessage.getSendMode() + "");
        map.put(RemoteMessageAttributes.CONTENTS, remoteMessage.describeContents() + "");
        map.put("analyticInfo", remoteMessage.getAnalyticInfo());
        map.put(RemoteMessageAttributes.ANALYTIC_INFO_MAP, remoteMessage.getAnalyticInfoMap() + "");
        if (remoteMessage.getNotification() != null) {
            RemoteMessage.Notification notification = remoteMessage.getNotification();
            map.put("title", notification.getTitle());
            map.put(RemoteMessageAttributes.TITLE_LOCALIZATION_KEY, notification.getTitleLocalizationKey());
            map.put(RemoteMessageAttributes.TITLE_LOCALIZATION_ARGS, Arrays.toString(notification.getTitleLocalizationArgs()));
            map.put(RemoteMessageAttributes.BODY_LOCALIZATION_KEY, notification.getBodyLocalizationKey());
            map.put(RemoteMessageAttributes.BODY_LOCALIZATION_ARGS, Arrays.toString(notification.getBodyLocalizationArgs()));
            map.put("body", notification.getBody());
            map.put("icon", notification.getIcon());
            map.put(RemoteMessageAttributes.SOUND, notification.getSound());
            map.put(RemoteMessageAttributes.TAG, notification.getTag());
            map.put(RemoteMessageAttributes.COLOR, notification.getColor());
            map.put(RemoteMessageAttributes.CLICK_ACTION, notification.getClickAction());
            map.put(RemoteMessageAttributes.CHANNEL_ID, notification.getChannelId());
            map.put(RemoteMessageAttributes.IMAGE_URL, notification.getImageUrl() + "");
            map.put(RemoteMessageAttributes.LINK, notification.getLink() + "");
            map.put(RemoteMessageAttributes.NOTIFY_ID, notification.getNotifyId() + "");
            map.put(RemoteMessageAttributes.WHEN, notification.getWhen() + "");
            map.put(RemoteMessageAttributes.LIGHT_SETTINGS, Arrays.toString(notification.getLightSettings()));
            map.put(RemoteMessageAttributes.BADGE_NUMBER, notification.getBadgeNumber() + "");
            map.put(RemoteMessageAttributes.IMPORTANCE, notification.getImportance() + "");
            map.put(RemoteMessageAttributes.TICKER, notification.getTicker());
            map.put(RemoteMessageAttributes.VIBRATE_CONFIG, Arrays.toString(notification.getVibrateConfig()));
            map.put("visibility", notification.getVisibility() + "");
            map.put("intentUri", notification.getIntentUri());
            map.put(RemoteMessageAttributes.IS_AUTO_CANCEL, notification.isAutoCancel() + "");
            map.put(RemoteMessageAttributes.IS_LOCAL_ONLY, notification.isLocalOnly() + "");
            map.put(RemoteMessageAttributes.IS_DEFAULT_LIGHT, notification.isDefaultLight() + "");
            map.put(RemoteMessageAttributes.IS_DEFAULT_SOUND, notification.isDefaultSound() + "");
            map.put(RemoteMessageAttributes.IS_DEFAULT_VIBRATE, notification.isDefaultVibrate() + "");
        }
        return map;
    }

    public static RemoteMessage toRemoteMessage(ReadableMap readableMap) {
        String string = readableMap.getString("to");
        if (string == null || string.equals("")) {
            string = Core.REMOTE_MESSAGE_UPLINK_TO;
        }
        RemoteMessage.Builder builder = new RemoteMessage.Builder(string);
        String string2 = readableMap.hasKey(RemoteMessageAttributes.MESSAGE_ID) ? readableMap.getString(RemoteMessageAttributes.MESSAGE_ID) : NotificationConfigUtils.generateNotificationId();
        String string3 = readableMap.hasKey(RemoteMessageAttributes.MESSAGE_TYPE) ? readableMap.getString(RemoteMessageAttributes.MESSAGE_TYPE) : "hms";
        int i = readableMap.hasKey("ttl") ? readableMap.getInt("ttl") : 120;
        String string4 = readableMap.hasKey("collapseKey") ? readableMap.getString("collapseKey") : ResultCode.ERROR;
        int i2 = readableMap.hasKey("receiptMode") ? readableMap.getInt("receiptMode") : 1;
        int i3 = readableMap.hasKey("sendMode") ? readableMap.getInt("sendMode") : 1;
        ReadableMap map = readableMap.hasKey("data") ? readableMap.getMap("data") : null;
        if (map != null) {
            builder.setData(MapUtils.toStringMap(map));
        }
        builder.setCollapseKey(string4);
        builder.setMessageId(string2);
        builder.setReceiptMode(i2);
        builder.setSendMode(i3);
        builder.setMessageType(string3);
        builder.setTtl(i);
        return builder.build();
    }

    public static WritableMap toWritableMap(RemoteMessage remoteMessage) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("collapseKey", remoteMessage.getCollapseKey());
        writableMapCreateMap.putString("data", remoteMessage.getData());
        writableMapCreateMap.putString(RemoteMessageAttributes.DATA_OF_MAP, remoteMessage.getDataOfMap() + "");
        writableMapCreateMap.putString(RemoteMessageAttributes.MESSAGE_ID, remoteMessage.getMessageId());
        writableMapCreateMap.putString(RemoteMessageAttributes.MESSAGE_TYPE, remoteMessage.getMessageType());
        writableMapCreateMap.putString(RemoteMessageAttributes.ORIGINAL_URGENCY, remoteMessage.getOriginalUrgency() + "");
        writableMapCreateMap.putString("urgency", remoteMessage.getUrgency() + "");
        writableMapCreateMap.putString("ttl", remoteMessage.getTtl() + "");
        writableMapCreateMap.putString(RemoteMessageAttributes.SENT_TIME, remoteMessage.getSentTime() + "");
        writableMapCreateMap.putString("to", remoteMessage.getTo());
        writableMapCreateMap.putString("from", remoteMessage.getFrom());
        writableMapCreateMap.putString("token", remoteMessage.getToken());
        writableMapCreateMap.putString("receiptMode", remoteMessage.getReceiptMode() + "");
        writableMapCreateMap.putString("sendMode", remoteMessage.getSendMode() + "");
        writableMapCreateMap.putString(RemoteMessageAttributes.CONTENTS, remoteMessage.describeContents() + "");
        writableMapCreateMap.putString("analyticInfo", remoteMessage.getAnalyticInfo());
        writableMapCreateMap.putString(RemoteMessageAttributes.ANALYTIC_INFO_MAP, remoteMessage.getAnalyticInfoMap() + "");
        if (remoteMessage.getNotification() != null) {
            RemoteMessage.Notification notification = remoteMessage.getNotification();
            writableMapCreateMap.putString("title", notification.getTitle());
            writableMapCreateMap.putString(RemoteMessageAttributes.TITLE_LOCALIZATION_KEY, notification.getTitleLocalizationKey());
            writableMapCreateMap.putString(RemoteMessageAttributes.TITLE_LOCALIZATION_ARGS, Arrays.toString(notification.getTitleLocalizationArgs()));
            writableMapCreateMap.putString(RemoteMessageAttributes.BODY_LOCALIZATION_KEY, notification.getBodyLocalizationKey());
            writableMapCreateMap.putString(RemoteMessageAttributes.BODY_LOCALIZATION_ARGS, Arrays.toString(notification.getBodyLocalizationArgs()));
            writableMapCreateMap.putString("body", notification.getBody());
            writableMapCreateMap.putString("icon", notification.getIcon());
            writableMapCreateMap.putString(RemoteMessageAttributes.SOUND, notification.getSound());
            writableMapCreateMap.putString(RemoteMessageAttributes.TAG, notification.getTag());
            writableMapCreateMap.putString(RemoteMessageAttributes.COLOR, notification.getColor());
            writableMapCreateMap.putString(RemoteMessageAttributes.CLICK_ACTION, notification.getClickAction());
            writableMapCreateMap.putString(RemoteMessageAttributes.CHANNEL_ID, notification.getChannelId());
            writableMapCreateMap.putString(RemoteMessageAttributes.IMAGE_URL, notification.getImageUrl() + "");
            writableMapCreateMap.putString(RemoteMessageAttributes.LINK, notification.getLink() + "");
            writableMapCreateMap.putString(RemoteMessageAttributes.NOTIFY_ID, notification.getNotifyId() + "");
            writableMapCreateMap.putString(RemoteMessageAttributes.WHEN, notification.getWhen() + "");
            writableMapCreateMap.putString(RemoteMessageAttributes.LIGHT_SETTINGS, Arrays.toString(notification.getLightSettings()));
            writableMapCreateMap.putString(RemoteMessageAttributes.BADGE_NUMBER, notification.getBadgeNumber() + "");
            writableMapCreateMap.putString(RemoteMessageAttributes.IMPORTANCE, notification.getImportance() + "");
            writableMapCreateMap.putString(RemoteMessageAttributes.TICKER, notification.getTicker());
            writableMapCreateMap.putString(RemoteMessageAttributes.VIBRATE_CONFIG, Arrays.toString(notification.getVibrateConfig()));
            writableMapCreateMap.putString("visibility", notification.getVisibility() + "");
            writableMapCreateMap.putString("intentUri", notification.getIntentUri());
            writableMapCreateMap.putString(RemoteMessageAttributes.IS_AUTO_CANCEL, notification.isAutoCancel() + "");
            writableMapCreateMap.putString(RemoteMessageAttributes.IS_LOCAL_ONLY, notification.isLocalOnly() + "");
            writableMapCreateMap.putString(RemoteMessageAttributes.IS_DEFAULT_LIGHT, notification.isDefaultLight() + "");
            writableMapCreateMap.putString(RemoteMessageAttributes.IS_DEFAULT_SOUND, notification.isDefaultSound() + "");
            writableMapCreateMap.putString(RemoteMessageAttributes.IS_DEFAULT_VIBRATE, notification.isDefaultVibrate() + "");
        }
        return writableMapCreateMap;
    }
}
