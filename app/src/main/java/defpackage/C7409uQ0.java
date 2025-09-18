package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.ICancelToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: uQ0 */
/* loaded from: classes.dex */
public final class C7409uQ0 implements InterfaceC4347iS, InterfaceC5834mA0, InterfaceC0069Aq0, InterfaceC1415Rx0, InterfaceC3299cy0, RemoteCall, InterfaceC3871fy0, InterfaceC7055sZ1 {
    public Object a;

    public /* synthetic */ C7409uQ0(Object obj) {
        this.a = obj;
    }

    public void a() {
        Thread threadCurrentThread = Thread.currentThread();
        if (((Thread) this.a) == null) {
            this.a = threadCurrentThread;
        }
        UN1.a(O90.a((Thread) this.a, threadCurrentThread));
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Api.ClientKey clientKey = RB1.a;
        ((C8325zE1) obj).p((Location) this.a, (S81) obj2);
    }

    @Override // defpackage.InterfaceC3871fy0
    public void b() {
        try {
            ((ICancelToken) this.a).cancel();
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.InterfaceC7055sZ1
    public void c(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        FR1 fr1 = (FR1) this.a;
        if (zIsEmpty) {
            fr1.J1("auto", "_err", bundle, true, true, ((C3386dP1) fr1.b).n.currentTimeMillis());
        } else {
            ((C3386dP1) fr1.b).getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public C8004xY0 d() {
        C8004xY0 c8004xY0 = new C8004xY0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.a).entrySet()) {
            C4012gh1 c4012gh1 = (C4012gh1) entry.getValue();
            if (c4012gh1.e) {
                c8004xY0.a(c4012gh1.a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        AbstractC0759Jm0.f("UseCaseAttachState");
        return c8004xY0;
    }

    public Collection e() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.a).entrySet()) {
            if (((C4012gh1) entry.getValue()).e) {
                arrayList.add(((C4012gh1) entry.getValue()).a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public Collection f() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.a).entrySet()) {
            if (((C4012gh1) entry.getValue()).e) {
                arrayList.add(((C4012gh1) entry.getValue()).b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    @Override // defpackage.InterfaceC0069Aq0
    public boolean g(MenuC0225Cq0 menuC0225Cq0, MenuItem menuItem) {
        C6273oT0 c6273oT0 = ((Toolbar) this.a).O;
        return false;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new GV0((Context) ((C0552Gv0) this.a).a, "com.google.android.datatransport.events", Integer.valueOf(GV0.d).intValue());
    }

    public boolean h(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        if (linkedHashMap.containsKey(str)) {
            return ((C4012gh1) linkedHashMap.get(str)).e;
        }
        return false;
    }

    @Override // defpackage.InterfaceC5834mA0
    public Object i(Uri uri, C2282bD c2282bD) throws XmlPullParserException, C5643lA0 {
        try {
            XmlPullParser xmlPullParserNewPullParser = ((XmlPullParserFactory) this.a).newPullParser();
            xmlPullParserNewPullParser.setInput(c2282bD, null);
            return (J31) new O31(uri.toString()).e(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e) {
            throw C5643lA0.b(null, e);
        }
    }

    public void j(String str, C8194yY0 c8194yY0, InterfaceC5361jh1 interfaceC5361jh1, C0500Ge c0500Ge, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        if (linkedHashMap.containsKey(str)) {
            C4012gh1 c4012gh1 = new C4012gh1(c8194yY0, interfaceC5361jh1, c0500Ge, list);
            C4012gh1 c4012gh12 = (C4012gh1) linkedHashMap.get(str);
            c4012gh1.e = c4012gh12.e;
            c4012gh1.f = c4012gh12.f;
            linkedHashMap.put(str, c4012gh1);
        }
    }

    @Override // defpackage.InterfaceC0069Aq0
    public void k(MenuC0225Cq0 menuC0225Cq0) {
        Toolbar toolbar = (Toolbar) this.a;
        C6189o2 c6189o2 = toolbar.a.t;
        if (c6189o2 == null || !c6189o2.j()) {
            Iterator it = toolbar.G.b.iterator();
            while (it.hasNext()) {
                ((C2535cY) ((InterfaceC1940Yq0) it.next())).a.s(menuC0225Cq0);
            }
        }
        C6273oT0 c6273oT0 = toolbar.O;
        if (c6273oT0 != null) {
            c6273oT0.k(menuC0225Cq0);
        }
    }

    public Object l() {
        Map mapEmptyMap;
        C8162yN1 c8162yN1 = (C8162yN1) this.a;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = c8162yN1.a.acquireUnstableContentProviderClient(c8162yN1.b);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                return Collections.emptyMap();
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(c8162yN1.b, C8162yN1.i, null, null, null);
            try {
                if (cursorQuery == null) {
                    mapEmptyMap = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        mapEmptyMap = Collections.emptyMap();
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    } else {
                        Map c7925x8 = count <= 256 ? new C7925x8(count) : new HashMap(count, 1.0f);
                        while (cursorQuery.moveToNext()) {
                            c7925x8.put(cursorQuery.getString(0), cursorQuery.getString(1));
                        }
                        if (cursorQuery.isAfterLast()) {
                            cursorQuery.close();
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            return c7925x8;
                        }
                        mapEmptyMap = Collections.emptyMap();
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    }
                }
                return mapEmptyMap;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RemoteException unused) {
            return Collections.emptyMap();
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    public void m(Bundle bundle, String str) {
        String string;
        C3386dP1 c3386dP1 = (C3386dP1) this.a;
        C7595vO1 c7595vO1 = c3386dP1.j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
        if (c3386dP1.f()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        UM1 um1 = c3386dP1.h;
        C3386dP1.b(um1);
        um1.y.t(string);
        C3386dP1.b(um1);
        um1.z.h(c3386dP1.n.currentTimeMillis());
    }

    public boolean n() {
        UM1 um1 = ((C3386dP1) this.a).h;
        C3386dP1.b(um1);
        return um1.z.g() > 0;
    }

    public boolean o() {
        if (!n()) {
            return false;
        }
        C3386dP1 c3386dP1 = (C3386dP1) this.a;
        long jCurrentTimeMillis = c3386dP1.n.currentTimeMillis();
        UM1 um1 = c3386dP1.h;
        C3386dP1.b(um1);
        return jCurrentTimeMillis - um1.z.g() > c3386dP1.g.A1(null, IB1.e0);
    }

    @Override // defpackage.InterfaceC1415Rx0
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.a).countDown();
    }

    @Override // defpackage.InterfaceC3299cy0
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.a).countDown();
    }

    public C7409uQ0(int i) {
        switch (i) {
            case 4:
                try {
                    this.a = XmlPullParserFactory.newInstance();
                    return;
                } catch (XmlPullParserException e) {
                    throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
                }
            case 11:
                this.a = new CountDownLatch(1);
                return;
            default:
                this.a = (ExtraCroppingQuirk) AbstractC7768wJ.a.z0(ExtraCroppingQuirk.class);
                return;
        }
    }
}
