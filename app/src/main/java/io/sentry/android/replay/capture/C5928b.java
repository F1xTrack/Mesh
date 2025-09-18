package io.sentry.android.replay.capture;

import io.sentry.protocol.C6104t;
import java.util.concurrent.atomic.AtomicReference;
import p000.InterfaceC10293mf0;
import p000.InterfaceC11025sN0;
import p000.O90;

/* renamed from: io.sentry.android.replay.capture.b */
/* loaded from: classes2.dex */
public final class C5928b implements InterfaceC11025sN0 {

    /* renamed from: a */
    public final /* synthetic */ int f33912a;

    /* renamed from: b */
    public final AtomicReference f33913b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC5929c f33914c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC5929c f33915d;

    public C5928b(AbstractC5929c abstractC5929c, AbstractC5929c abstractC5929c2, int i) {
        this.f33912a = i;
        switch (i) {
            case 2:
                this.f33914c = abstractC5929c;
                this.f33915d = abstractC5929c2;
                this.f33913b = new AtomicReference(-1);
                break;
            case 3:
                this.f33914c = abstractC5929c;
                this.f33915d = abstractC5929c2;
                this.f33913b = new AtomicReference(null);
                break;
            case 4:
                this.f33914c = abstractC5929c;
                this.f33915d = abstractC5929c2;
                this.f33913b = new AtomicReference(null);
                break;
            case 5:
                this.f33914c = abstractC5929c;
                this.f33915d = abstractC5929c2;
                this.f33913b = new AtomicReference(null);
                break;
            default:
                this.f33914c = abstractC5929c;
                this.f33915d = abstractC5929c2;
                this.f33913b = new AtomicReference(null);
                break;
        }
    }

    @Override // p000.InterfaceC11025sN0
    public final Object getValue(Object obj, InterfaceC10293mf0 interfaceC10293mf0) {
        switch (this.f33912a) {
            case 0:
                O90.m5968f(interfaceC10293mf0, "property");
                break;
            case 1:
                O90.m5968f(interfaceC10293mf0, "property");
                break;
            case 2:
                O90.m5968f(interfaceC10293mf0, "property");
                break;
            case 3:
                O90.m5968f(interfaceC10293mf0, "property");
                break;
            case 4:
                O90.m5968f(interfaceC10293mf0, "property");
                break;
            default:
                O90.m5968f(interfaceC10293mf0, "property");
                break;
        }
        return this.f33913b.get();
    }

    public C5928b(C6104t c6104t, AbstractC5929c abstractC5929c, AbstractC5929c abstractC5929c2) {
        this.f33912a = 1;
        this.f33914c = abstractC5929c;
        this.f33915d = abstractC5929c2;
        this.f33913b = new AtomicReference(c6104t);
    }
}
