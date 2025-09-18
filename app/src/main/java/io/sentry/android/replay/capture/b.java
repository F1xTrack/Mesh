package io.sentry.android.replay.capture;

import defpackage.InterfaceC5927mf0;
import defpackage.InterfaceC7018sN0;
import defpackage.O90;
import io.sentry.protocol.t;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b implements InterfaceC7018sN0 {
    public final /* synthetic */ int a;
    public final AtomicReference b;
    public final /* synthetic */ c c;
    public final /* synthetic */ c d;

    public b(c cVar, c cVar2, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.c = cVar;
                this.d = cVar2;
                this.b = new AtomicReference(-1);
                break;
            case 3:
                this.c = cVar;
                this.d = cVar2;
                this.b = new AtomicReference(null);
                break;
            case 4:
                this.c = cVar;
                this.d = cVar2;
                this.b = new AtomicReference(null);
                break;
            case 5:
                this.c = cVar;
                this.d = cVar2;
                this.b = new AtomicReference(null);
                break;
            default:
                this.c = cVar;
                this.d = cVar2;
                this.b = new AtomicReference(null);
                break;
        }
    }

    @Override // defpackage.InterfaceC7018sN0
    public final Object getValue(Object obj, InterfaceC5927mf0 interfaceC5927mf0) {
        switch (this.a) {
            case 0:
                O90.f(interfaceC5927mf0, "property");
                break;
            case 1:
                O90.f(interfaceC5927mf0, "property");
                break;
            case 2:
                O90.f(interfaceC5927mf0, "property");
                break;
            case 3:
                O90.f(interfaceC5927mf0, "property");
                break;
            case 4:
                O90.f(interfaceC5927mf0, "property");
                break;
            default:
                O90.f(interfaceC5927mf0, "property");
                break;
        }
        return this.b.get();
    }

    public b(t tVar, c cVar, c cVar2) {
        this.a = 1;
        this.c = cVar;
        this.d = cVar2;
        this.b = new AtomicReference(tVar);
    }
}
