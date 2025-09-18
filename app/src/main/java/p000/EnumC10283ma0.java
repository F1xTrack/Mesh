package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ma0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10283ma0 implements Iterator {

    /* renamed from: a */
    public static final EnumC10283ma0 f37779a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC10283ma0[] f37780b;

    static {
        EnumC10283ma0 enumC10283ma0 = new EnumC10283ma0("INSTANCE", 0);
        f37779a = enumC10283ma0;
        f37780b = new EnumC10283ma0[]{enumC10283ma0};
    }

    public static EnumC10283ma0 valueOf(String str) {
        return (EnumC10283ma0) Enum.valueOf(EnumC10283ma0.class, str);
    }

    public static EnumC10283ma0[] values() {
        return (EnumC10283ma0[]) f37780b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        QL1.m6671g(false, "no calls to next() since the last call to remove()");
    }
}
