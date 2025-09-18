package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3440dh1 implements InterfaceC7302ts0 {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final InterfaceC7302ts0 a;

    public C3440dh1(InterfaceC7302ts0 interfaceC7302ts0) {
        this.a = interfaceC7302ts0;
    }

    @Override // defpackage.InterfaceC7302ts0
    public final boolean a(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.InterfaceC7302ts0
    public final C7111ss0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        return this.a.b(new E10(((Uri) obj).toString(), L20.a), i, i2, c0795Jy0);
    }
}
