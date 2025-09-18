package io.sentry;

import io.sentry.rrweb.EnumC6132c;
import io.sentry.rrweb.EnumC6133d;

/* renamed from: io.sentry.I0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5773I0 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f33296a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f33297b;

    static {
        int[] iArr = new int[EnumC6132c.values().length];
        f33297b = iArr;
        try {
            iArr[EnumC6132c.IncrementalSnapshot.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f33297b[EnumC6132c.Meta.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f33297b[EnumC6132c.Custom.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC6133d.values().length];
        f33296a = iArr2;
        try {
            iArr2[EnumC6133d.MouseInteraction.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f33296a[EnumC6133d.TouchMove.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
