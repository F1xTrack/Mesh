package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import kotlin.Metadata;
import p000.HandlerC8740aZ0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m22267d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "<init>", "()V", "aZ0", "com.google.firebase-firebase-sessions"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: a */
    public final HandlerThread f18528a = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: b */
    public HandlerC8740aZ0 f18529b;

    /* renamed from: c */
    public Messenger f18530c;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            return null;
        }
        intent.getAction();
        Messenger messenger = Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        if (messenger != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messenger;
            HandlerC8740aZ0 handlerC8740aZ0 = this.f18529b;
            if (handlerC8740aZ0 != null) {
                handlerC8740aZ0.sendMessage(messageObtain);
            }
        }
        Messenger messenger2 = this.f18530c;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.f18528a;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        O90.m5967e(looper, "handlerThread.looper");
        this.f18529b = new HandlerC8740aZ0(looper);
        this.f18530c = new Messenger(this.f18529b);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f18528a.quit();
    }
}
