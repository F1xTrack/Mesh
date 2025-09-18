package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* loaded from: classes2.dex */
public class G6 {
    private final c a;

    @TargetApi(26)
    public static class a implements c {
        private final D6 a;

        public a(Context context) {
            this.a = new D6(context);
        }

        @Override // com.yandex.metrica.impl.ob.G6.c
        public E6 a() {
            return this.a;
        }
    }

    public static class b implements c {
        private final F6 a;

        public b(Context context) {
            this.a = new F6(context);
        }

        @Override // com.yandex.metrica.impl.ob.G6.c
        public E6 a() {
            return this.a;
        }
    }

    public interface c {
        E6 a();
    }

    public G6(Context context) {
        this(Build.VERSION.SDK_INT >= 26 ? new a(context) : new b(context));
    }

    public E6 a() {
        return this.a.a();
    }

    public G6(c cVar) {
        this.a = cVar;
    }
}
