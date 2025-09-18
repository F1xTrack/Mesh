package com.vk.push.common.utils;

import defpackage.InterfaceC5908mZ;
import defpackage.O90;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ac\u0010\b\u001a\u0004\u0018\u00018\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\r\u001a\u00020\n*\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"", "T1", "T2", "R", "p1", "p2", "Lkotlin/Function2;", "block", "multiLet", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "", "Lkotlin/Function0;", "LTf1;", "ifTrue", "(ZLmZ;)Z", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonExtensionsKt {
    public static final boolean ifTrue(boolean z, InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(interfaceC5908mZ, "block");
        if (z) {
            interfaceC5908mZ.invoke();
        }
        return z;
    }

    public static final <T1, T2, R> R multiLet(T1 t1, T2 t2, Function2 function2) {
        O90.f(function2, "block");
        if (t1 == null || t2 == null) {
            return null;
        }
        return (R) function2.invoke(t1, t2);
    }
}
