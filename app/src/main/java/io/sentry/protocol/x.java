package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.AbstractC5116d;
import io.sentry.C5151o1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class x implements InterfaceC5141l0 {
    public String a;
    public String b;
    public String c;
    public Integer d;
    public Integer e;
    public String f;
    public String g;
    public Boolean h;
    public String i;
    public Boolean j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public ConcurrentHashMap p;
    public String q;
    public C5151o1 r;

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("filename").d(this.a);
        }
        if (this.b != null) {
            a0.u("function").d(this.b);
        }
        if (this.c != null) {
            a0.u("module").d(this.c);
        }
        if (this.d != null) {
            a0.u("lineno").m(this.d);
        }
        if (this.e != null) {
            a0.u("colno").m(this.e);
        }
        if (this.f != null) {
            a0.u("abs_path").d(this.f);
        }
        if (this.g != null) {
            a0.u("context_line").d(this.g);
        }
        if (this.h != null) {
            a0.u("in_app").s(this.h);
        }
        if (this.i != null) {
            a0.u("package").d(this.i);
        }
        if (this.j != null) {
            a0.u("native").s(this.j);
        }
        if (this.k != null) {
            a0.u("platform").d(this.k);
        }
        if (this.l != null) {
            a0.u("image_addr").d(this.l);
        }
        if (this.m != null) {
            a0.u("symbol_addr").d(this.m);
        }
        if (this.n != null) {
            a0.u("instruction_addr").d(this.n);
        }
        if (this.q != null) {
            a0.u("raw_function").d(this.q);
        }
        if (this.o != null) {
            a0.u("symbol").d(this.o);
        }
        if (this.r != null) {
            a0.u("lock").r(iLogger, this.r);
        }
        ConcurrentHashMap concurrentHashMap = this.p;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.p, str, a0, str, iLogger);
            }
        }
        a0.j();
    }
}
