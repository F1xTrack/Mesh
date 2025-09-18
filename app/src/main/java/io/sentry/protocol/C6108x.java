package io.sentry.protocol;

import io.sentry.AbstractC6008d;
import io.sentry.C6072o1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.x */
/* loaded from: classes2.dex */
public final class C6108x implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34465a;

    /* renamed from: b */
    public String f34466b;

    /* renamed from: c */
    public String f34467c;

    /* renamed from: d */
    public Integer f34468d;

    /* renamed from: e */
    public Integer f34469e;

    /* renamed from: f */
    public String f34470f;

    /* renamed from: g */
    public String f34471g;

    /* renamed from: h */
    public Boolean f34472h;

    /* renamed from: i */
    public String f34473i;

    /* renamed from: j */
    public Boolean f34474j;

    /* renamed from: k */
    public String f34475k;

    /* renamed from: l */
    public String f34476l;

    /* renamed from: m */
    public String f34477m;

    /* renamed from: n */
    public String f34478n;

    /* renamed from: o */
    public String f34479o;

    /* renamed from: p */
    public ConcurrentHashMap f34480p;

    /* renamed from: q */
    public String f34481q;

    /* renamed from: r */
    public C6072o1 f34482r;

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34465a != null) {
            interfaceC5749A0.mo13828u("filename").mo13811d(this.f34465a);
        }
        if (this.f34466b != null) {
            interfaceC5749A0.mo13828u("function").mo13811d(this.f34466b);
        }
        if (this.f34467c != null) {
            interfaceC5749A0.mo13828u("module").mo13811d(this.f34467c);
        }
        if (this.f34468d != null) {
            interfaceC5749A0.mo13828u("lineno").mo13820m(this.f34468d);
        }
        if (this.f34469e != null) {
            interfaceC5749A0.mo13828u("colno").mo13820m(this.f34469e);
        }
        if (this.f34470f != null) {
            interfaceC5749A0.mo13828u("abs_path").mo13811d(this.f34470f);
        }
        if (this.f34471g != null) {
            interfaceC5749A0.mo13828u("context_line").mo13811d(this.f34471g);
        }
        if (this.f34472h != null) {
            interfaceC5749A0.mo13828u("in_app").mo13826s(this.f34472h);
        }
        if (this.f34473i != null) {
            interfaceC5749A0.mo13828u("package").mo13811d(this.f34473i);
        }
        if (this.f34474j != null) {
            interfaceC5749A0.mo13828u("native").mo13826s(this.f34474j);
        }
        if (this.f34475k != null) {
            interfaceC5749A0.mo13828u("platform").mo13811d(this.f34475k);
        }
        if (this.f34476l != null) {
            interfaceC5749A0.mo13828u("image_addr").mo13811d(this.f34476l);
        }
        if (this.f34477m != null) {
            interfaceC5749A0.mo13828u("symbol_addr").mo13811d(this.f34477m);
        }
        if (this.f34478n != null) {
            interfaceC5749A0.mo13828u("instruction_addr").mo13811d(this.f34478n);
        }
        if (this.f34481q != null) {
            interfaceC5749A0.mo13828u("raw_function").mo13811d(this.f34481q);
        }
        if (this.f34479o != null) {
            interfaceC5749A0.mo13828u("symbol").mo13811d(this.f34479o);
        }
        if (this.f34482r != null) {
            interfaceC5749A0.mo13828u("lock").mo13825r(iLogger, this.f34482r);
        }
        ConcurrentHashMap concurrentHashMap = this.f34480p;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34480p, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
