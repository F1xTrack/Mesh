package p000;

import android.os.Looper;
import com.huawei.hmf.tasks.Task;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public abstract class CJ1 {
    /* renamed from: a */
    public static Object m1141a(String str, Object obj, Object obj2, Double d, Object obj3) throws C0226Da {
        if (obj instanceof C7366Ba0) {
            return obj3;
        }
        if (!(obj instanceof Double)) {
            throw new C0226Da(str.concat(" value is invalid."), 10);
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(dDoubleValue) || dDoubleValue > d.doubleValue() || dDoubleValue < ((Double) obj2).doubleValue()) {
            throw new C0226Da(str.concat(" value is invalid."), 10);
        }
        return obj;
    }

    /* renamed from: b */
    public static Object m1142b(Map map, String str, int i, Object obj, Object obj2) throws C0226Da {
        Object objM17501a = AbstractC9080dA1.m17501a(str, map);
        if (objM17501a instanceof C7366Ba0) {
            return obj2;
        }
        if (objM17501a instanceof C7314Aa0) {
            objM17501a = "";
        }
        if (i == 1 && !(objM17501a instanceof Boolean)) {
            throw new C0226Da("Boolean option expected but not found", 10);
        }
        if (i == 2 && !(objM17501a instanceof String)) {
            throw new C0226Da("String option expected but not found", 10);
        }
        if ((obj instanceof C7366Ba0) || Arrays.asList((Object[]) obj).contains(objM17501a)) {
            return objM17501a;
        }
        throw new C0226Da("String option expected but not found", 10);
    }

    /* renamed from: c */
    public static Object m1143c(Task task) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("await must not be called on the UI thread");
        }
        if (task.mo8876f()) {
            if (task.mo8877g()) {
                return task.mo8875e();
            }
            throw new ExecutionException(task.mo8874d());
        }
        C11287uQ0 c11287uQ0 = new C11287uQ0(11);
        task.mo8873c(c11287uQ0);
        task.mo8872b(c11287uQ0);
        ((CountDownLatch) c11287uQ0.f43693a).await();
        if (task.mo8877g()) {
            return task.mo8875e();
        }
        throw new ExecutionException(task.mo8874d());
    }

    /* renamed from: d */
    public static C8499Wu1 m1144d(Callable callable) {
        ThreadPoolExecutor threadPoolExecutor = X81.f13575c.f13576a;
        T81 t81 = new T81();
        try {
            threadPoolExecutor.execute(new RunnableC1483XZ(t81, 25, callable));
        } catch (Exception e) {
            t81.m7576a(e);
        }
        return t81.f11181a;
    }

    /* renamed from: e */
    public static Enum m1145e(Class cls, Object obj) {
        if (obj instanceof C7366Ba0) {
            return Enum.valueOf(cls, "UNDEFINED");
        }
        if (obj instanceof C7314Aa0) {
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
