package com.huawei.hms.rn.push.config;

import android.os.Bundle;
import com.huawei.hms.rn.push.constants.Core;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import com.huawei.hms.rn.push.constants.ResultCode;
import com.huawei.hms.rn.push.utils.BundleUtils;
import com.yandex.varioqub.config.model.ConfigValue;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NotificationAttributes {
    private final String actions;
    private final boolean allowWhileIdle;
    private final boolean autoCancel;
    private final String bigPictureUrl;
    private final String bigText;
    private final String channelDescription;
    private final String channelId;
    private final String channelName;
    private final String color;
    private final String data;
    private final boolean dontNotifyInForeground;
    private final double fireDate;
    private final String group;
    private final boolean groupSummary;
    private final String id;
    private final boolean invokeApp;
    private final String largeIcon;
    private final String largeIconUrl;
    private final String message;
    private final String number;
    private final boolean ongoing;
    private final boolean playSound;
    private final double repeatTime;
    private final String repeatType;
    private final String shortcutId;
    private final boolean showWhen;
    private final String smallIcon;
    private final String sound;
    private final String subText;
    private final String tag;
    private final String ticker;
    private final String title;
    private final boolean vibrate;
    private final double vibrateDuration;

    public NotificationAttributes(Bundle bundle) {
        this.id = BundleUtils.get(bundle, NotificationConstants.ID);
        this.message = BundleUtils.get(bundle, "message");
        this.fireDate = BundleUtils.getD(bundle, NotificationConstants.FIRE_DATE);
        this.title = BundleUtils.get(bundle, "title");
        this.ticker = BundleUtils.get(bundle, "ticker");
        this.showWhen = BundleUtils.getB(bundle, NotificationConstants.SHOW_WHEN);
        this.autoCancel = BundleUtils.getB(bundle, "autoCancel");
        this.largeIcon = BundleUtils.get(bundle, NotificationConstants.LARGE_ICON);
        this.largeIconUrl = BundleUtils.get(bundle, NotificationConstants.LARGE_ICON_URL);
        this.smallIcon = BundleUtils.get(bundle, NotificationConstants.SMALL_ICON);
        this.bigText = BundleUtils.get(bundle, NotificationConstants.BIG_TEXT);
        this.subText = BundleUtils.get(bundle, NotificationConstants.SUB_TEXT);
        this.bigPictureUrl = BundleUtils.get(bundle, NotificationConstants.BIG_PICTURE_URL);
        this.shortcutId = BundleUtils.get(bundle, NotificationConstants.SHORTCUT_ID);
        this.number = BundleUtils.get(bundle, NotificationConstants.NUMBER);
        this.channelId = BundleUtils.get(bundle, "channelId");
        this.channelName = BundleUtils.get(bundle, NotificationConstants.CHANNEL_NAME);
        this.channelDescription = BundleUtils.get(bundle, NotificationConstants.CHANNEL_DESCRIPTION);
        this.sound = BundleUtils.get(bundle, "sound");
        this.color = BundleUtils.get(bundle, "color");
        this.group = BundleUtils.get(bundle, NotificationConstants.GROUP);
        this.groupSummary = BundleUtils.getB(bundle, NotificationConstants.GROUP_SUMMARY);
        this.playSound = BundleUtils.getB(bundle, NotificationConstants.PLAY_SOUND);
        this.vibrate = BundleUtils.getB(bundle, NotificationConstants.VIBRATE);
        this.vibrateDuration = BundleUtils.getD(bundle, NotificationConstants.VIBRATE_DURATION);
        this.actions = BundleUtils.get(bundle, NotificationConstants.ACTIONS);
        this.invokeApp = BundleUtils.getB(bundle, NotificationConstants.INVOKE_APP);
        this.tag = BundleUtils.get(bundle, "tag");
        this.repeatType = BundleUtils.get(bundle, NotificationConstants.REPEAT_TYPE);
        this.repeatTime = BundleUtils.getD(bundle, NotificationConstants.REPEAT_TIME);
        this.ongoing = BundleUtils.getB(bundle, NotificationConstants.ONGOING);
        this.allowWhileIdle = BundleUtils.getB(bundle, NotificationConstants.ALLOW_WHILE_IDLE);
        this.data = BundleUtils.convertJSON(bundle.getBundle("data"));
        this.dontNotifyInForeground = BundleUtils.getB(bundle, NotificationConstants.DONT_NOTIFY_IN_FOREGROUND);
    }

    public static NotificationAttributes fromJson(String str) throws JSONException {
        return new NotificationAttributes(new JSONObject(str));
    }

    public String getActions() {
        return this.actions;
    }

    public String getBigPictureUrl() {
        return this.bigPictureUrl;
    }

    public String getBigText() {
        return this.bigText;
    }

    public String getChannelDescription() {
        return this.channelDescription;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public String getColor() {
        return this.color;
    }

    public String getData() {
        return this.data;
    }

    public double getFireDate() {
        return this.fireDate;
    }

    public String getGroup() {
        return this.group;
    }

    public String getId() {
        return this.id;
    }

    public String getLargeIcon() {
        return this.largeIcon;
    }

    public String getLargeIconUrl() {
        return this.largeIconUrl;
    }

    public String getMessage() {
        return this.message;
    }

    public String getNumber() {
        return this.number;
    }

    public double getRepeatTime() {
        return this.repeatTime;
    }

    public String getRepeatType() {
        return this.repeatType;
    }

    public String getShortcutId() {
        return this.shortcutId;
    }

    public String getSmallIcon() {
        return this.smallIcon;
    }

    public String getSound() {
        return this.sound;
    }

    public String getSubText() {
        return this.subText;
    }

    public String getTag() {
        return this.tag;
    }

    public String getTicker() {
        return this.ticker;
    }

    public String getTitle() {
        return this.title;
    }

    public double getVibrateDuration() {
        return this.vibrateDuration;
    }

    public boolean isAllowWhileIdle() {
        return this.allowWhileIdle;
    }

    public boolean isAutoCancel() {
        return this.autoCancel;
    }

    public boolean isDontNotifyInForeground() {
        return this.dontNotifyInForeground;
    }

    public boolean isGroupSummary() {
        return this.groupSummary;
    }

    public boolean isInvokeApp() {
        return this.invokeApp;
    }

    public boolean isOngoing() {
        return this.ongoing;
    }

    public boolean isPlaySound() {
        return this.playSound;
    }

    public boolean isShowWhen() {
        return this.showWhen;
    }

    public boolean isVibrate() {
        return this.vibrate;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        BundleUtils.set(bundle, NotificationConstants.ID, this.id);
        BundleUtils.set(bundle, "message", this.message);
        BundleUtils.setD(bundle, NotificationConstants.FIRE_DATE, this.fireDate);
        BundleUtils.set(bundle, "title", this.title);
        BundleUtils.set(bundle, "ticker", this.ticker);
        BundleUtils.setB(bundle, NotificationConstants.SHOW_WHEN, this.showWhen);
        BundleUtils.setB(bundle, "autoCancel", this.autoCancel);
        BundleUtils.set(bundle, NotificationConstants.LARGE_ICON, this.largeIcon);
        BundleUtils.set(bundle, NotificationConstants.LARGE_ICON_URL, this.largeIconUrl);
        BundleUtils.set(bundle, NotificationConstants.SMALL_ICON, this.smallIcon);
        BundleUtils.set(bundle, NotificationConstants.BIG_TEXT, this.bigText);
        BundleUtils.set(bundle, NotificationConstants.SUB_TEXT, this.subText);
        BundleUtils.set(bundle, NotificationConstants.BIG_PICTURE_URL, this.bigPictureUrl);
        BundleUtils.set(bundle, NotificationConstants.SHORTCUT_ID, this.shortcutId);
        BundleUtils.set(bundle, NotificationConstants.NUMBER, this.number);
        BundleUtils.set(bundle, "channelId", this.channelId);
        BundleUtils.set(bundle, NotificationConstants.CHANNEL_NAME, this.channelName);
        BundleUtils.set(bundle, NotificationConstants.CHANNEL_DESCRIPTION, this.channelDescription);
        BundleUtils.set(bundle, "sound", this.sound);
        BundleUtils.set(bundle, "color", this.color);
        BundleUtils.set(bundle, NotificationConstants.GROUP, this.group);
        BundleUtils.setB(bundle, NotificationConstants.GROUP_SUMMARY, this.groupSummary);
        BundleUtils.setB(bundle, NotificationConstants.PLAY_SOUND, this.playSound);
        BundleUtils.setB(bundle, NotificationConstants.VIBRATE, this.vibrate);
        BundleUtils.setD(bundle, NotificationConstants.VIBRATE_DURATION, this.vibrateDuration);
        BundleUtils.set(bundle, NotificationConstants.ACTIONS, this.actions);
        BundleUtils.setB(bundle, NotificationConstants.INVOKE_APP, this.invokeApp);
        BundleUtils.set(bundle, "tag", this.tag);
        BundleUtils.set(bundle, NotificationConstants.REPEAT_TYPE, this.repeatType);
        BundleUtils.setD(bundle, NotificationConstants.REPEAT_TIME, this.repeatTime);
        BundleUtils.setB(bundle, NotificationConstants.ONGOING, this.ongoing);
        BundleUtils.setB(bundle, NotificationConstants.ALLOW_WHILE_IDLE, this.allowWhileIdle);
        BundleUtils.setB(bundle, NotificationConstants.DONT_NOTIFY_IN_FOREGROUND, this.dontNotifyInForeground);
        BundleUtils.set(bundle, "data", this.data);
        return bundle;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationConstants.ID, this.id);
            jSONObject.put("message", this.message);
            jSONObject.put(NotificationConstants.FIRE_DATE, this.fireDate);
            jSONObject.put("title", this.title);
            jSONObject.put("ticker", this.ticker);
            jSONObject.put(NotificationConstants.SHOW_WHEN, this.showWhen);
            jSONObject.put("autoCancel", this.autoCancel);
            jSONObject.put(NotificationConstants.LARGE_ICON, this.largeIcon);
            jSONObject.put(NotificationConstants.LARGE_ICON_URL, this.largeIconUrl);
            jSONObject.put(NotificationConstants.SMALL_ICON, this.smallIcon);
            jSONObject.put(NotificationConstants.BIG_TEXT, this.bigText);
            jSONObject.put(NotificationConstants.BIG_PICTURE_URL, this.bigPictureUrl);
            jSONObject.put(NotificationConstants.SUB_TEXT, this.subText);
            jSONObject.put(NotificationConstants.SHORTCUT_ID, this.shortcutId);
            jSONObject.put(NotificationConstants.NUMBER, this.number);
            jSONObject.put("channelId", this.channelId);
            jSONObject.put(NotificationConstants.CHANNEL_NAME, this.channelName);
            jSONObject.put(NotificationConstants.CHANNEL_DESCRIPTION, this.channelDescription);
            jSONObject.put("sound", this.sound);
            jSONObject.put("color", this.color);
            jSONObject.put(NotificationConstants.GROUP, this.group);
            jSONObject.put(NotificationConstants.GROUP_SUMMARY, this.groupSummary);
            jSONObject.put(NotificationConstants.PLAY_SOUND, this.playSound);
            jSONObject.put(NotificationConstants.VIBRATE, this.vibrate);
            jSONObject.put(NotificationConstants.VIBRATE_DURATION, this.vibrateDuration);
            jSONObject.put(NotificationConstants.ACTIONS, this.actions);
            jSONObject.put(NotificationConstants.INVOKE_APP, this.invokeApp);
            jSONObject.put("tag", this.tag);
            jSONObject.put(NotificationConstants.REPEAT_TYPE, this.repeatType);
            jSONObject.put(NotificationConstants.REPEAT_TIME, this.repeatTime);
            jSONObject.put(NotificationConstants.ONGOING, this.ongoing);
            jSONObject.put(NotificationConstants.ALLOW_WHILE_IDLE, this.allowWhileIdle);
            jSONObject.put(NotificationConstants.DONT_NOTIFY_IN_FOREGROUND, this.dontNotifyInForeground);
            jSONObject.put("data", this.data);
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    private NotificationAttributes(JSONObject jSONObject) {
        try {
            this.id = jSONObject.has(NotificationConstants.ID) ? jSONObject.getString(NotificationConstants.ID) : null;
            this.message = jSONObject.has("message") ? jSONObject.getString("message") : Core.DEFAULT_MESSAGE;
            boolean zHas = jSONObject.has(NotificationConstants.FIRE_DATE);
            double d = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.fireDate = zHas ? jSONObject.getDouble(NotificationConstants.FIRE_DATE) : 0.0d;
            this.title = jSONObject.has("title") ? jSONObject.getString("title") : null;
            this.ticker = jSONObject.has("ticker") ? jSONObject.getString("ticker") : null;
            boolean z = true;
            this.showWhen = !jSONObject.has(NotificationConstants.SHOW_WHEN) || jSONObject.getBoolean(NotificationConstants.SHOW_WHEN);
            this.autoCancel = !jSONObject.has("autoCancel") || jSONObject.getBoolean("autoCancel");
            this.largeIcon = jSONObject.has(NotificationConstants.LARGE_ICON) ? jSONObject.getString(NotificationConstants.LARGE_ICON) : null;
            this.largeIconUrl = jSONObject.has(NotificationConstants.LARGE_ICON_URL) ? jSONObject.getString(NotificationConstants.LARGE_ICON_URL) : null;
            this.smallIcon = jSONObject.has(NotificationConstants.SMALL_ICON) ? jSONObject.getString(NotificationConstants.SMALL_ICON) : null;
            this.bigText = jSONObject.has(NotificationConstants.BIG_TEXT) ? jSONObject.getString(NotificationConstants.BIG_TEXT) : null;
            this.subText = jSONObject.has(NotificationConstants.SUB_TEXT) ? jSONObject.getString(NotificationConstants.SUB_TEXT) : null;
            this.bigPictureUrl = jSONObject.has(NotificationConstants.BIG_PICTURE_URL) ? jSONObject.getString(NotificationConstants.BIG_PICTURE_URL) : null;
            this.shortcutId = jSONObject.has(NotificationConstants.SHORTCUT_ID) ? jSONObject.getString(NotificationConstants.SHORTCUT_ID) : null;
            this.number = jSONObject.has(NotificationConstants.NUMBER) ? jSONObject.getString(NotificationConstants.NUMBER) : null;
            this.channelId = jSONObject.has("channelId") ? jSONObject.getString("channelId") : null;
            this.channelName = jSONObject.has(NotificationConstants.CHANNEL_NAME) ? jSONObject.getString(NotificationConstants.CHANNEL_NAME) : null;
            this.channelDescription = jSONObject.has(NotificationConstants.CHANNEL_DESCRIPTION) ? jSONObject.getString(NotificationConstants.CHANNEL_DESCRIPTION) : null;
            this.sound = jSONObject.has("sound") ? jSONObject.getString("sound") : null;
            this.color = jSONObject.has("color") ? jSONObject.getString("color") : null;
            this.group = jSONObject.has(NotificationConstants.GROUP) ? jSONObject.getString(NotificationConstants.GROUP) : null;
            this.groupSummary = jSONObject.has(NotificationConstants.GROUP_SUMMARY) && jSONObject.getBoolean(NotificationConstants.GROUP_SUMMARY);
            this.playSound = !jSONObject.has(NotificationConstants.PLAY_SOUND) || jSONObject.getBoolean(NotificationConstants.PLAY_SOUND);
            this.vibrate = !jSONObject.has(NotificationConstants.VIBRATE) || jSONObject.getBoolean(NotificationConstants.VIBRATE);
            this.vibrateDuration = jSONObject.has(NotificationConstants.VIBRATE_DURATION) ? jSONObject.getDouble(NotificationConstants.VIBRATE_DURATION) : 1000.0d;
            this.actions = jSONObject.has(NotificationConstants.ACTIONS) ? jSONObject.getString(NotificationConstants.ACTIONS) : null;
            this.invokeApp = !jSONObject.has(NotificationConstants.INVOKE_APP) || jSONObject.getBoolean(NotificationConstants.INVOKE_APP);
            this.tag = jSONObject.has("tag") ? jSONObject.getString("tag") : null;
            this.repeatType = jSONObject.has(NotificationConstants.REPEAT_TYPE) ? jSONObject.getString(NotificationConstants.REPEAT_TYPE) : null;
            this.repeatTime = jSONObject.has(NotificationConstants.REPEAT_TIME) ? jSONObject.getDouble(NotificationConstants.REPEAT_TIME) : d;
            this.ongoing = jSONObject.has(NotificationConstants.ONGOING) && jSONObject.getBoolean(NotificationConstants.ONGOING);
            this.allowWhileIdle = jSONObject.has(NotificationConstants.ALLOW_WHILE_IDLE) && jSONObject.getBoolean(NotificationConstants.ALLOW_WHILE_IDLE);
            if (!jSONObject.has(NotificationConstants.DONT_NOTIFY_IN_FOREGROUND) || !jSONObject.getBoolean(NotificationConstants.DONT_NOTIFY_IN_FOREGROUND)) {
                z = false;
            }
            this.dontNotifyInForeground = z;
            this.data = jSONObject.has("data") ? jSONObject.getString("data") : null;
        } catch (IllegalStateException e) {
            e = e;
            throw new IllegalStateException(ResultCode.ERROR, e);
        } catch (NullPointerException e2) {
            e = e2;
            throw new IllegalStateException(ResultCode.ERROR, e);
        } catch (NumberFormatException e3) {
            e = e3;
            throw new IllegalStateException(ResultCode.ERROR, e);
        } catch (JSONException e4) {
            e = e4;
            throw new IllegalStateException(ResultCode.ERROR, e);
        }
    }
}
