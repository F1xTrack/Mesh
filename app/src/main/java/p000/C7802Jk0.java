package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: Jk0 */
/* loaded from: classes.dex */
public final class C7802Jk0 implements InterfaceC7854Kk0 {

    /* renamed from: c */
    public static final Locale[] f5678c = new Locale[0];

    /* renamed from: a */
    public final Locale[] f5679a;

    /* renamed from: b */
    public final String f5680b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public C7802Jk0(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f5679a = f5678c;
            this.f5680b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException(AbstractC7222ym.m26230g(i, "list[", "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f5679a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f5680b = sb.toString();
    }

    @Override // p000.InterfaceC7854Kk0
    /* renamed from: a */
    public final String mo4399a() {
        return this.f5680b;
    }

    @Override // p000.InterfaceC7854Kk0
    /* renamed from: b */
    public final Object mo4400b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7802Jk0)) {
            return false;
        }
        Locale[] localeArr = ((C7802Jk0) obj).f5679a;
        Locale[] localeArr2 = this.f5679a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC7854Kk0
    public final Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f5679a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f5679a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // p000.InterfaceC7854Kk0
    public final boolean isEmpty() {
        return this.f5679a.length == 0;
    }

    @Override // p000.InterfaceC7854Kk0
    public final int size() {
        return this.f5679a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f5679a;
            if (i >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i]);
            if (i < localeArr.length - 1) {
                sb.append(',');
            }
            i++;
        }
    }
}
