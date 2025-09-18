package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.u5 */
/* loaded from: classes2.dex */
public abstract class AbstractC5489u5 implements InterfaceC5477ti {

    /* renamed from: a */
    public BaseRequestConfig f32672a;

    /* renamed from: b */
    public final BaseRequestConfig.RequestConfigLoader f32673b;

    /* renamed from: c */
    public C4726P5 f32674c;

    public AbstractC5489u5(BaseRequestConfig.RequestConfigLoader<Object, C4726P5> requestConfigLoader, C5155gl c5155gl, ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f32673b = requestConfigLoader;
        C5244ka.m20614h().m20634s().m21134a(this);
        m21114a(new C4726P5(c5155gl, C5244ka.m20614h().m20634s(), C5244ka.m20614h().m20631p(), argumentsMerger));
    }

    /* renamed from: a */
    public final synchronized void m21114a(C4726P5 c4726p5) {
        this.f32674c = c4726p5;
    }

    /* renamed from: b */
    public final synchronized ArgumentsMerger<Object, Object> m21116b() {
        return (ArgumentsMerger) this.f32674c.componentArguments;
    }

    /* renamed from: c */
    public final synchronized C5155gl m21117c() {
        return this.f32674c.f30602a;
    }

    /* renamed from: d */
    public final void m21118d() {
        synchronized (this) {
            this.f32672a = null;
        }
    }

    /* renamed from: e */
    public final synchronized void m21119e() {
        this.f32672a = null;
    }

    /* renamed from: a */
    public synchronized void mo19538a(Object obj) {
        if (!((ArgumentsMerger) this.f32674c.componentArguments).compareWithOtherArguments(obj)) {
            m21114a(new C4726P5(m21117c(), C5244ka.f32038C.m20634s(), C5244ka.f32038C.m20631p(), (ArgumentsMerger) ((ArgumentsMerger) this.f32674c.componentArguments).mergeFrom(obj)));
            m21119e();
        }
    }

    /* renamed from: a */
    public final synchronized void m21115a(C5155gl c5155gl) {
        m21114a(new C4726P5(c5155gl, C5244ka.f32038C.m20634s(), C5244ka.f32038C.m20631p(), m21116b()));
        m21119e();
    }

    /* renamed from: a */
    public final synchronized BaseRequestConfig m21113a() {
        try {
            if (this.f32672a == null) {
                this.f32672a = this.f32673b.load(this.f32674c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f32672a;
    }
}
