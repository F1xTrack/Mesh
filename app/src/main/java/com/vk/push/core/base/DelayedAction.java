package com.vk.push.core.base;

import defpackage.AbstractC3767fP1;
import defpackage.AbstractC7625vY1;
import defpackage.C3895g41;
import defpackage.C7952xH;
import defpackage.GK;
import defpackage.InterfaceC0952Lz;
import defpackage.InterfaceC5908mZ;
import defpackage.O90;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/vk/push/core/base/DelayedAction;", "", "LLz;", "scope", "Lkotlin/Function0;", "LTf1;", NotificationConstants.ACTION, "<init>", "(LLz;LmZ;)V", "", "delayMillis", "runWithDelay", "(J)V", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DelayedAction {
    public final InterfaceC0952Lz a;
    public final InterfaceC5908mZ b;
    public C3895g41 c;

    public DelayedAction(InterfaceC0952Lz interfaceC0952Lz, InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(interfaceC0952Lz, "scope");
        O90.f(interfaceC5908mZ, NotificationConstants.ACTION);
        this.a = interfaceC0952Lz;
        this.b = interfaceC5908mZ;
    }

    public final void runWithDelay(long delayMillis) {
        synchronized (this) {
            C3895g41 c3895g41 = this.c;
            if (c3895g41 != null) {
                c3895g41.l(null);
            }
            this.c = AbstractC3767fP1.b(this.a, null, new C7952xH(delayMillis, this, null), 3);
        }
    }

    public DelayedAction(InterfaceC0952Lz interfaceC0952Lz, InterfaceC5908mZ interfaceC5908mZ, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AbstractC7625vY1.a(GK.b.o(1, null)) : interfaceC0952Lz, interfaceC5908mZ);
    }
}
