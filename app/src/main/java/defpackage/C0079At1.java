package defpackage;

import com.vk.push.common.component.PushTokenComponent;
import com.vk.push.common.component.TopicComponent;

/* renamed from: At1 */
/* loaded from: classes2.dex */
public final class C0079At1 implements TopicComponent, InterfaceC4051gu1, InterfaceC1161Oq1, PushTokenComponent {
    public static C0781Jt1 b() {
        C0781Jt1 c0781Jt1 = C0781Jt1.v;
        if (c0781Jt1 != null) {
            return c0781Jt1;
        }
        throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
    }

    public static boolean c() {
        return C0781Jt1.v != null;
    }

    @Override // defpackage.InterfaceC1161Oq1
    public final Q81 a() {
        if (c()) {
            return b().a();
        }
        C5661lG0 c5661lG0 = new C5661lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        Q81 q81 = new Q81();
        c5661lG0.invoke(new K81(q81));
        return q81;
    }

    @Override // com.vk.push.common.component.PushTokenComponent
    public final Q81 deleteToken() {
        if (c()) {
            return b().deleteToken();
        }
        C5661lG0 c5661lG0 = new C5661lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        Q81 q81 = new Q81();
        c5661lG0.invoke(new K81(q81));
        return q81;
    }

    @Override // com.vk.push.common.component.PushTokenComponent
    public final Q81 getToken() {
        if (c()) {
            return b().getToken();
        }
        C5661lG0 c5661lG0 = new C5661lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        Q81 q81 = new Q81();
        c5661lG0.invoke(new K81(q81));
        return q81;
    }

    @Override // com.vk.push.common.component.TopicComponent
    public final Q81 subscribeToTopic(String str) {
        O90.f(str, "topic");
        if (c()) {
            return b().subscribeToTopic(str);
        }
        C5661lG0 c5661lG0 = new C5661lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        Q81 q81 = new Q81();
        c5661lG0.invoke(new K81(q81));
        return q81;
    }

    @Override // com.vk.push.common.component.TopicComponent
    public final Q81 unsubscribeFromTopic(String str) {
        O90.f(str, "topic");
        if (c()) {
            return b().unsubscribeFromTopic(str);
        }
        C5661lG0 c5661lG0 = new C5661lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        Q81 q81 = new Q81();
        c5661lG0.invoke(new K81(q81));
        return q81;
    }

    @Override // defpackage.InterfaceC4051gu1
    public final Q81 a(T71 t71) {
        if (!c()) {
            C5661lG0 c5661lG0 = new C5661lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
            Q81 q81 = new Q81();
            c5661lG0.invoke(new K81(q81));
            return q81;
        }
        C0781Jt1 c0781Jt1B = b();
        C1020Mv1 c1020Mv1 = C1538Tm0.h;
        if (c1020Mv1 != null) {
            if (!c1020Mv1.i) {
                C5661lG0 c5661lG02 = new C5661lG0(10, new IllegalStateException("Unable to send test notification, you need to enable test mode firstly"));
                Q81 q812 = new Q81();
                c5661lG02.invoke(new K81(q812));
                return q812;
            }
            return ((InterfaceC4051gu1) c0781Jt1B.q.getValue()).a(t71);
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }
}
