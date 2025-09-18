package defpackage;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: g9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3908g9 implements InterfaceC7302ts0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C3908g9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC7302ts0
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC7302ts0) it.next()).a(obj)) {
                        return true;
                    }
                }
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.InterfaceC7302ts0
    public final C7111ss0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        C7798wT c7798wT;
        C7111ss0 c7111ss0B;
        Uri uri;
        switch (this.a) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                C1958Yw0 c1958Yw0 = new C1958Yw0(uri2);
                Object obj2 = this.c;
                AssetManager assetManager = (AssetManager) this.b;
                switch (((C3717f9) obj2).a) {
                    case 0:
                        c7798wT = new C7798wT(assetManager, strSubstring, 0);
                        break;
                    default:
                        c7798wT = new C7798wT(assetManager, strSubstring, 1);
                        break;
                }
                return new C7111ss0(c1958Yw0, c7798wT);
            case 1:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC0660If0 interfaceC0660If0 = null;
                for (int i3 = 0; i3 < size; i3++) {
                    InterfaceC7302ts0 interfaceC7302ts0 = (InterfaceC7302ts0) arrayList.get(i3);
                    if (interfaceC7302ts0.a(obj) && (c7111ss0B = interfaceC7302ts0.b(obj, i, i2, c0795Jy0)) != null) {
                        arrayList2.add(c7111ss0B.c);
                        interfaceC0660If0 = c7111ss0B.a;
                    }
                }
                if (arrayList2.isEmpty() || interfaceC0660If0 == null) {
                    return null;
                }
                return new C7111ss0(interfaceC0660If0, new C6160nt0(arrayList2, (C1857Xo1) this.c));
            default:
                Integer num = (Integer) obj;
                Resources resources = (Resources) this.c;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + '/' + resources.getResourceTypeName(num.intValue()) + '/' + resources.getResourceEntryName(num.intValue()));
                } catch (Resources.NotFoundException unused) {
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((InterfaceC7302ts0) this.b).b(uri, i, i2, c0795Jy0);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C3908g9(Resources resources, InterfaceC7302ts0 interfaceC7302ts0) {
        this.a = 2;
        this.c = resources;
        this.b = interfaceC7302ts0;
    }
}
