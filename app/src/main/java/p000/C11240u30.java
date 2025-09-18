package p000;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: u30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11240u30 extends AbstractC11368v30 {

    /* renamed from: n */
    public static final C11240u30 f43455n = new C11240u30("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d */
    public final List f43456d;

    /* renamed from: e */
    public final List f43457e;

    /* renamed from: f */
    public final List f43458f;

    /* renamed from: g */
    public final List f43459g;

    /* renamed from: h */
    public final List f43460h;

    /* renamed from: i */
    public final List f43461i;

    /* renamed from: j */
    public final C6686qX f43462j;

    /* renamed from: k */
    public final List f43463k;

    /* renamed from: l */
    public final Map f43464l;

    /* renamed from: m */
    public final List f43465m;

    public C11240u30(String str, List list, List list2, List list3, List list4, List list5, List list6, C6686qX c6686qX, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((C11112t30) list2.get(i)).f42814a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m25096b(arrayList, list3);
        m25096b(arrayList, list4);
        m25096b(arrayList, list5);
        m25096b(arrayList, list6);
        this.f43456d = Collections.unmodifiableList(arrayList);
        this.f43457e = Collections.unmodifiableList(list2);
        this.f43458f = Collections.unmodifiableList(list3);
        this.f43459g = Collections.unmodifiableList(list4);
        this.f43460h = Collections.unmodifiableList(list5);
        this.f43461i = Collections.unmodifiableList(list6);
        this.f43462j = c6686qX;
        this.f43463k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f43464l = Collections.unmodifiableMap(map);
        this.f43465m = Collections.unmodifiableList(list8);
    }

    /* renamed from: b */
    public static void m25096b(ArrayList arrayList, List list) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C10984s30) list.get(i)).f42235a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    /* renamed from: c */
    public static ArrayList m25097c(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    C9198e51 c9198e51 = (C9198e51) list2.get(i3);
                    if (c9198e51.f26538b == i && c9198e51.f26539c == i2) {
                        arrayList.add(obj);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    @Override // p000.InterfaceC6952uU
    /* renamed from: a */
    public final Object mo4151a(List list) {
        return new C11240u30(this.f44119a, this.f44120b, m25097c(this.f43457e, 0, list), Collections.emptyList(), m25097c(this.f43459g, 1, list), m25097c(this.f43460h, 2, list), Collections.emptyList(), this.f43462j, this.f43463k, this.f44121c, this.f43464l, this.f43465m);
    }
}
