package p000;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: Mk0 */
/* loaded from: classes.dex */
public final class C7958Mk0 implements InterfaceC7854Kk0 {

    /* renamed from: a */
    public final LocaleList f7317a;

    public C7958Mk0(Object obj) {
        this.f7317a = AbstractC7906Lk0.m5082l(obj);
    }

    @Override // p000.InterfaceC7854Kk0
    /* renamed from: a */
    public final String mo4399a() {
        return this.f7317a.toLanguageTags();
    }

    @Override // p000.InterfaceC7854Kk0
    /* renamed from: b */
    public final Object mo4400b() {
        return this.f7317a;
    }

    public final boolean equals(Object obj) {
        return this.f7317a.equals(((InterfaceC7854Kk0) obj).mo4400b());
    }

    @Override // p000.InterfaceC7854Kk0
    public final Locale get(int i) {
        return this.f7317a.get(i);
    }

    public final int hashCode() {
        return this.f7317a.hashCode();
    }

    @Override // p000.InterfaceC7854Kk0
    public final boolean isEmpty() {
        return this.f7317a.isEmpty();
    }

    @Override // p000.InterfaceC7854Kk0
    public final int size() {
        return this.f7317a.size();
    }

    public final String toString() {
        return this.f7317a.toString();
    }
}
