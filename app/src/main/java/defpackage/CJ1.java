package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public abstract class CJ1 {
    public static Object a(String str, Object obj, Object obj2, Double d, Object obj3) throws C0254Da {
        if (obj instanceof C0099Ba0) {
            return obj3;
        }
        if (!(obj instanceof Double)) {
            throw new C0254Da(str.concat(" value is invalid."), 10);
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(dDoubleValue) || dDoubleValue > d.doubleValue() || dDoubleValue < ((Double) obj2).doubleValue()) {
            throw new C0254Da(str.concat(" value is invalid."), 10);
        }
        return obj;
    }

    public static Object b(Map map, String str, int i, Object obj, Object obj2) throws C0254Da {
        Object objA = AbstractC3341dA1.a(str, map);
        if (objA instanceof C0099Ba0) {
            return obj2;
        }
        if (objA instanceof C0021Aa0) {
            objA = "";
        }
        if (i == 1 && !(objA instanceof Boolean)) {
            throw new C0254Da("Boolean option expected but not found", 10);
        }
        if (i == 2 && !(objA instanceof String)) {
            throw new C0254Da("String option expected but not found", 10);
        }
        if ((obj instanceof C0099Ba0) || Arrays.asList((Object[]) obj).contains(objA)) {
            return objA;
        }
        throw new C0254Da("String option expected but not found", 10);
    }

    public static Object c(Task task) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("await must not be called on the UI thread");
        }
        if (task.f()) {
            if (task.g()) {
                return task.e();
            }
            throw new ExecutionException(task.d());
        }
        C7409uQ0 c7409uQ0 = new C7409uQ0(11);
        task.c(c7409uQ0);
        task.b(c7409uQ0);
        ((CountDownLatch) c7409uQ0.a).await();
        if (task.g()) {
            return task.e();
        }
        throw new ExecutionException(task.d());
    }

    public static C1797Wu1 d(Callable callable) {
        ThreadPoolExecutor threadPoolExecutor = X81.c.a;
        T81 t81 = new T81();
        try {
            threadPoolExecutor.execute(new XZ(t81, 25, callable));
        } catch (Exception e) {
            t81.a(e);
        }
        return t81.a;
    }

    public static Enum e(Class cls, Object obj) {
        if (obj instanceof C0099Ba0) {
            return Enum.valueOf(cls, "UNDEFINED");
        }
        if (obj instanceof C0021Aa0) {
            return null;
        }
        String str = (String) obj;
        if (str.equals("2-digit")) {
            return Enum.valueOf(cls, "DIGIT2");
        }
        for (Enum r3 : (Enum[]) cls.getEnumConstants()) {
            if (r3.name().compareToIgnoreCase(str) == 0) {
                return r3;
            }
        }
        return null;
    }
}
