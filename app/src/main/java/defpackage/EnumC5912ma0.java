package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ma0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5912ma0 implements Iterator {
    public static final EnumC5912ma0 a;
    public static final /* synthetic */ EnumC5912ma0[] b;

    static {
        EnumC5912ma0 enumC5912ma0 = new EnumC5912ma0("INSTANCE", 0);
        a = enumC5912ma0;
        b = new EnumC5912ma0[]{enumC5912ma0};
    }

    public static EnumC5912ma0 valueOf(String str) {
        return (EnumC5912ma0) Enum.valueOf(EnumC5912ma0.class, str);
    }

    public static EnumC5912ma0[] values() {
        return (EnumC5912ma0[]) b.clone();
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
        QL1.g(false, "no calls to next() since the last call to remove()");
    }
}
