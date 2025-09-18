package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* renamed from: lD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5651lD {
    public final Context a;
    public final String b;
    public final C61 c;
    public final C6273oT0 d;
    public final ArrayList e;
    public final boolean f;
    public final int g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final LinkedHashSet l;
    public final ArrayList m;
    public final ArrayList n;

    public C5651lD(Context context, String str, C61 c61, C6273oT0 c6273oT0, ArrayList arrayList, boolean z, int i, Executor executor, Executor executor2, boolean z2, boolean z3, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        O90.f(context, "context");
        O90.f(c6273oT0, "migrationContainer");
        NX.m(i, "journalMode");
        O90.f(executor, "queryExecutor");
        O90.f(executor2, "transactionExecutor");
        O90.f(arrayList2, "typeConverters");
        O90.f(arrayList3, "autoMigrationSpecs");
        this.a = context;
        this.b = str;
        this.c = c61;
        this.d = c6273oT0;
        this.e = arrayList;
        this.f = z;
        this.g = i;
        this.h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = z3;
        this.l = linkedHashSet;
        this.m = arrayList2;
        this.n = arrayList3;
    }
}
