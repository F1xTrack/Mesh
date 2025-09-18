package p000;

import com.p019vk.push.common.component.PushTokenComponent;
import com.p019vk.push.common.component.TopicComponent;

/* renamed from: At1 */
/* loaded from: classes2.dex */
public final class C7353At1 implements TopicComponent, InterfaceC9556gu1, InterfaceC8075Oq1, PushTokenComponent {
    /* renamed from: b */
    public static C7821Jt1 m367b() {
        C7821Jt1 c7821Jt1 = C7821Jt1.f5775v;
        if (c7821Jt1 != null) {
            return c7821Jt1;
        }
        throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
    }

    /* renamed from: c */
    public static boolean m368c() {
        return C7821Jt1.f5775v != null;
    }

    @Override // p000.InterfaceC8075Oq1
    /* renamed from: a */
    public final Q81 mo369a() {
        if (m368c()) {
            return m367b().mo369a();
        }
        C10115lG0 c10115lG0 = new C10115lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        Q81 q81 = new Q81();
        c10115lG0.invoke(new K81(q81));
        return q81;
    }

    @Override // com.p019vk.push.common.component.PushTokenComponent
    public final Q81 deleteToken() {
        if (m368c()) {
            return m367b().deleteToken();
        }
        C10115lG0 c10115lG0 = new C10115lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        Q81 q81 = new Q81();
        c10115lG0.invoke(new K81(q81));
        return q81;
    }

    @Override // com.p019vk.push.common.component.PushTokenComponent
    public final Q81 getToken() {
        if (m368c()) {
            return m367b().getToken();
        }
        C10115lG0 c10115lG0 = new C10115lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        Q81 q81 = new Q81();
        c10115lG0.invoke(new K81(q81));
        return q81;
    }

    @Override // com.p019vk.push.common.component.TopicComponent
    public final Q81 subscribeToTopic(String str) {
        O90.m5968f(str, "topic");
        if (m368c()) {
            return m367b().subscribeToTopic(str);
        }
        C10115lG0 c10115lG0 = new C10115lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        Q81 q81 = new Q81();
        c10115lG0.invoke(new K81(q81));
        return q81;
    }

    @Override // com.p019vk.push.common.component.TopicComponent
    public final Q81 unsubscribeFromTopic(String str) {
        O90.m5968f(str, "topic");
        if (m368c()) {
            return m367b().unsubscribeFromTopic(str);
        }
        C10115lG0 c10115lG0 = new C10115lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        Q81 q81 = new Q81();
        c10115lG0.invoke(new K81(q81));
        return q81;
    }

    @Override // p000.InterfaceC9556gu1
    /* renamed from: a */
    public final Q81 mo370a(T71 t71) {
        if (!m368c()) {
            C10115lG0 c10115lG0 = new C10115lG0(10, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
            Q81 q81 = new Q81();
            c10115lG0.invoke(new K81(q81));
            return q81;
        }
        C7821Jt1 c7821Jt1M367b = m367b();
        C7981Mv1 c7981Mv1 = C8326Tm0.f11511h;
        if (c7981Mv1 != null) {
            if (!c7981Mv1.f7403i) {
                C10115lG0 c10115lG02 = new C10115lG0(10, new IllegalStateException("Unable to send test notification, you need to enable test mode firstly"));
                Q81 q812 = new Q81();
                c10115lG02.invoke(new K81(q812));
                return q812;
            }
            return ((InterfaceC9556gu1) c7821Jt1M367b.f5792q.getValue()).mo370a(t71);
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }
}
