package me.leolin.shortcutbadger.impl;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC8977cP1;
import p000.C11488w01;
import p000.InterfaceC7278zf;

@Deprecated
/* loaded from: classes2.dex */
public class XiaomiHomeBadger implements InterfaceC7278zf {

    /* renamed from: a */
    public ResolveInfo f37813a;

    @Override // p000.InterfaceC7278zf
    /* renamed from: a */
    public final void mo5479a(ReactApplicationContext reactApplicationContext, ComponentName componentName, int i) throws IllegalAccessException, NoSuchFieldException, InstantiationException, C11488w01, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object objValueOf;
        try {
            Object objNewInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = objNewInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i == 0) {
                objValueOf = "";
            } else {
                try {
                    objValueOf = Integer.valueOf(i);
                } catch (Exception unused) {
                    declaredField.set(objNewInstance, Integer.valueOf(i));
                }
            }
            declaredField.set(objNewInstance, String.valueOf(objValueOf));
        } catch (Exception unused2) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", componentName.getPackageName() + "/" + componentName.getClassName());
            intent.putExtra("android.intent.extra.update_application_message_text", String.valueOf(i == 0 ? "" : Integer.valueOf(i)));
            try {
                AbstractC8977cP1.m10693b(reactApplicationContext, intent);
            } catch (C11488w01 unused3) {
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            if (this.f37813a == null) {
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.HOME");
                this.f37813a = reactApplicationContext.getPackageManager().resolveActivity(intent2, 65536);
            }
            if (this.f37813a != null) {
                NotificationManager notificationManager = (NotificationManager) reactApplicationContext.getSystemService("notification");
                Notification notificationBuild = new Notification.Builder(reactApplicationContext).setContentTitle("").setContentText("").setSmallIcon(this.f37813a.getIconResource()).build();
                try {
                    Object obj = notificationBuild.getClass().getDeclaredField("extraNotification").get(notificationBuild);
                    obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
                    notificationManager.notify(0, notificationBuild);
                } catch (Exception e) {
                    throw new C11488w01("not able to set badge", e);
                }
            }
        }
    }

    @Override // p000.InterfaceC7278zf
    /* renamed from: b */
    public final List mo5480b() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }
}
