package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.Cursor;
import com.yandex.metrica.impl.ob.Pg;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class Ig {
    private final Context a;
    private Cursor b;

    public Ig(Context context) {
        this.a = context;
    }

    public void a(Xg xg) {
        try {
            try {
                FutureTask futureTask = new FutureTask(new Hg(this));
                P0.i().s().a(futureTask).start();
                Fg fg = (Fg) futureTask.get(5L, TimeUnit.SECONDS);
                U2.a(this.b);
                ((Pg.a) xg).a(fg);
            } catch (Throwable unused) {
                Og og = Og.this;
                Og.a(og, null, Og.c(og));
            }
        } finally {
            U2.a(this.b);
        }
    }
}
