package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9146dh1 implements InterfaceC11215ts0 {

    /* renamed from: b */
    public static final Set f26218b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    public final InterfaceC11215ts0 f26219a;

    public C9146dh1(InterfaceC11215ts0 interfaceC11215ts0) {
        this.f26219a = interfaceC11215ts0;
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: a */
    public final boolean mo8529a(Object obj) {
        return f26218b.contains(((Uri) obj).getScheme());
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: b */
    public final C11087ss0 mo8530b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        return this.f26219a.mo8530b(new E10(((Uri) obj).toString(), L20.f6471a), i, i2, c7830Jy0);
    }
}
