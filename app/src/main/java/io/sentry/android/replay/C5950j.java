package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.huawei.hms.framework.common.ContainerUtils;
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.protocol.C6104t;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0705LB;
import p000.AbstractC11374v51;
import p000.AbstractC6366lU;
import p000.AbstractC7038vr;
import p000.AbstractC7167xu;
import p000.AbstractC8729aT1;
import p000.AbstractC9639hY0;
import p000.C0564Ix;
import p000.C0764M8;
import p000.C1361Vd;
import p000.F71;
import p000.InterfaceC9127dY0;
import p000.O90;

/* renamed from: io.sentry.android.replay.j */
/* loaded from: classes2.dex */
public final class C5950j implements Closeable {

    /* renamed from: a */
    public final C5759D1 f33988a;

    /* renamed from: b */
    public final C6104t f33989b;

    /* renamed from: c */
    public final AtomicBoolean f33990c;

    /* renamed from: d */
    public final Object f33991d;

    /* renamed from: e */
    public C1361Vd f33992e;

    /* renamed from: f */
    public final F71 f33993f;

    /* renamed from: g */
    public final ArrayList f33994g;

    /* renamed from: h */
    public final LinkedHashMap f33995h;

    /* renamed from: i */
    public final F71 f33996i;

    public C5950j(C5759D1 c5759d1, C6104t c6104t) {
        O90.m5968f(c5759d1, "options");
        O90.m5968f(c6104t, "replayId");
        this.f33988a = c5759d1;
        this.f33989b = c6104t;
        this.f33990c = new AtomicBoolean(false);
        this.f33991d = new Object();
        this.f33993f = AbstractC0705LB.m4915b(new C5948h(this, 1));
        this.f33994g = new ArrayList();
        this.f33995h = new LinkedHashMap();
        this.f33996i = AbstractC0705LB.m4915b(new C5948h(this, 0));
    }

    /* renamed from: a */
    public final void m21671a(File file) {
        C5759D1 c5759d1 = this.f33988a;
        try {
            if (file.delete()) {
                return;
            }
            c5759d1.getLogger().mo21407k(EnumC6069n1.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            c5759d1.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    /* renamed from: c */
    public final boolean m21672c(C5951k c5951k) {
        if (c5951k == null) {
            return false;
        }
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(c5951k.f33997a.getAbsolutePath());
            synchronized (this.f33991d) {
                C1361Vd c1361Vd = this.f33992e;
                if (c1361Vd != null) {
                    O90.m5967e(bitmapDecodeFile, "bitmap");
                    c1361Vd.m8519e(bitmapDecodeFile);
                }
            }
            bitmapDecodeFile.recycle();
            return true;
        } catch (Throwable th) {
            this.f33988a.getLogger().mo21406d(EnumC6069n1.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th);
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f33991d) {
            try {
                C1361Vd c1361Vd = this.f33992e;
                if (c1361Vd != null) {
                    c1361Vd.m8522h();
                }
                this.f33992e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f33990c.set(true);
    }

    /* renamed from: m */
    public final File m21673m() {
        return (File) this.f33993f.getValue();
    }

    /* renamed from: n */
    public final synchronized void m21674n(String str, String str2) {
        File file;
        if (this.f33990c.get()) {
            return;
        }
        if (this.f33995h.isEmpty() && (file = (File) this.f33996i.getValue()) != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), AbstractC7038vr.f44561a), 8192);
            try {
                InterfaceC9127dY0 interfaceC9127dY0M18826e = AbstractC9639hY0.m18826e(new C0764M8(2, bufferedReader));
                LinkedHashMap linkedHashMap = this.f33995h;
                Iterator it = ((C0564Ix) interfaceC9127dY0M18826e).iterator();
                while (it.hasNext()) {
                    List listM25340O = AbstractC11374v51.m25340O((String) it.next(), new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, 2, 2);
                    linkedHashMap.put((String) listM25340O.get(0), (String) listM25340O.get(1));
                }
                AbstractC8729aT1.m9749a(bufferedReader, null);
            } finally {
            }
        }
        if (str2 == null) {
            this.f33995h.remove(str);
        } else {
            this.f33995h.put(str, str2);
        }
        File file2 = (File) this.f33996i.getValue();
        if (file2 != null) {
            Set setEntrySet = this.f33995h.entrySet();
            O90.m5967e(setEntrySet, "ongoingSegment.entries");
            AbstractC6366lU.m22438h(file2, AbstractC7167xu.m25962H(setEntrySet, "\n", null, null, C5925b.f33906g, 30));
        }
    }
}
