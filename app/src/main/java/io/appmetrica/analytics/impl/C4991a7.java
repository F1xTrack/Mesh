package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p028io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC7230yu;

/* renamed from: io.appmetrica.analytics.impl.a7 */
/* loaded from: classes2.dex */
public final class C4991a7 {

    /* renamed from: a */
    public final InterfaceC4559I6 f31244a;

    /* renamed from: b */
    public final List f31245b;

    /* renamed from: c */
    public final boolean f31246c;

    public C4991a7(InterfaceC4559I6 interfaceC4559I6, ArrayList arrayList, boolean z) {
        this.f31244a = interfaceC4559I6;
        this.f31245b = arrayList;
        this.f31246c = z;
    }

    /* renamed from: a */
    public final String m20105a(Context context, InterfaceC4918X6 interfaceC4918X6) {
        File parentFile;
        try {
            File fileMo19494a = this.f31244a.mo19494a(context, interfaceC4918X6.mo19903b());
            if (!fileMo19494a.exists() && (parentFile = fileMo19494a.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                m20106a(context, interfaceC4918X6.mo19902a(), fileMo19494a);
            }
            return fileMo19494a.getPath();
        } catch (Throwable unused) {
            return interfaceC4918X6.mo19903b();
        }
    }

    /* renamed from: a */
    public final void m20106a(Context context, String str, File file) {
        List list = this.f31245b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File fileMo19494a = ((InterfaceC4559I6) it.next()).mo19494a(context, str);
            if (fileMo19494a.exists()) {
                try {
                    if (this.f31246c) {
                        FileUtils.copyToNullable(fileMo19494a, file);
                    } else {
                        FileUtils.move(fileMo19494a, file);
                    }
                    String path = fileMo19494a.getPath();
                    String path2 = file.getPath();
                    for (String str2 : AbstractC7230yu.m26275f("-journal", "-shm", "-wal")) {
                        File file2 = new File(path + str2);
                        File file3 = new File(path2 + str2);
                        if (this.f31246c) {
                            FileUtils.copyToNullable(file2, file3);
                        } else {
                            FileUtils.move(file2, file3);
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }
}
