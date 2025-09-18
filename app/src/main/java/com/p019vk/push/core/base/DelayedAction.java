package com.p019vk.push.core.base;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC11432vY1;
import p000.AbstractC9366fP1;
import p000.C0399GK;
import p000.C7128xH;
import p000.C9452g41;
import p000.InterfaceC0754Lz;
import p000.InterfaceC6434mZ;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m22267d2 = {"Lcom/vk/push/core/base/DelayedAction;", "", "LLz;", "scope", "Lkotlin/Function0;", "LTf1;", NotificationConstants.ACTION, "<init>", "(LLz;LmZ;)V", "", "delayMillis", "runWithDelay", "(J)V", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class DelayedAction {

    /* renamed from: a */
    public final InterfaceC0754Lz f20338a;

    /* renamed from: b */
    public final InterfaceC6434mZ f20339b;

    /* renamed from: c */
    public C9452g41 f20340c;

    public DelayedAction(InterfaceC0754Lz interfaceC0754Lz, InterfaceC6434mZ interfaceC6434mZ) {
        O90.m5968f(interfaceC0754Lz, "scope");
        O90.m5968f(interfaceC6434mZ, NotificationConstants.ACTION);
        this.f20338a = interfaceC0754Lz;
        this.f20339b = interfaceC6434mZ;
    }

    public final void runWithDelay(long delayMillis) {
        synchronized (this) {
            C9452g41 c9452g41 = this.f20340c;
            if (c9452g41 != null) {
                c9452g41.m10810l(null);
            }
            this.f20340c = AbstractC9366fP1.m18230b(this.f20338a, null, new C7128xH(delayMillis, this, null), 3);
        }
    }

    public DelayedAction(InterfaceC0754Lz interfaceC0754Lz, InterfaceC6434mZ interfaceC6434mZ, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AbstractC11432vY1.m25444a(C0399GK.f3695b.mo2869o(1, null)) : interfaceC0754Lz, interfaceC6434mZ);
    }
}
