package io.invertase.firebase.messaging;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import p000.AbstractC11104t01;
import p000.C0226Da;
import p000.EL0;
import p000.FL0;
import p000.OQ0;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: c */
    public final void mo11319c() {
        FL0.f3159g.m2580b(new EL0("messaging_message_deleted", Arguments.createMap()));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: e */
    public final void mo11320e(String str) {
        FL0 fl0 = FL0.f3159g;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(RemoteMessageAttributes.MESSAGE_ID, str);
        fl0.m2580b(new EL0("messaging_message_sent", writableMapCreateMap));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: f */
    public final void mo10897f(String str) {
        FL0 fl0 = FL0.f3159g;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("token", str);
        fl0.m2580b(new EL0("messaging_token_refresh", writableMapCreateMap));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: g */
    public final void mo11321g(String str, C0226Da c0226Da) {
        FL0 fl0 = FL0.f3159g;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(RemoteMessageAttributes.MESSAGE_ID, str);
        writableMapCreateMap.putMap("error", AbstractC11104t01.m24816a(c0226Da));
        fl0.m2580b(new EL0("messaging_message_send_error", writableMapCreateMap));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: d */
    public final void mo10896d(OQ0 oq0) {
    }
}
