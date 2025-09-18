package com.swmansion.reanimated.layoutReanimation;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p000.AbstractC4060fY;

/* loaded from: classes2.dex */
public class TabNavigatorObserver {
    private final Set<Integer> mFragmentsWithListenerRegistry = new HashSet();
    private final ReaLayoutAnimator mReaLayoutAnimator;

    public class FragmentLifecycleCallbacks extends AbstractC4060fY {
        private View firstScreen;
        private Method getActivityState;
        private Method getScreen;
        private final Set<Integer> screenTagsWithListener = new HashSet();
        private final List<View> nextTransition = new ArrayList();

        public FragmentLifecycleCallbacks(Fragment fragment) throws NoSuchMethodException, SecurityException {
            if (ScreensHelper.isScreenFragment(fragment)) {
                try {
                    Method method = fragment.getClass().getMethod("getScreen", null);
                    this.getScreen = method;
                    View view = (View) method.invoke(fragment, null);
                    this.getActivityState = view.getClass().getMethod("getActivityState", null);
                    addScreenListener(view);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    if (e.getMessage() != null) {
                        e.getMessage();
                    }
                }
            }
        }

        private void addScreenListener(View view) throws IllegalAccessException, InvocationTargetException {
            if (this.screenTagsWithListener.contains(Integer.valueOf(view.getId()))) {
                return;
            }
            this.screenTagsWithListener.add(Integer.valueOf(view.getId()));
            view.addOnAttachStateChangeListener(TabNavigatorObserver.this.new OnAttachStateChangeListener());
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.swmansion.reanimated.layoutReanimation.b
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    this.f20251a.lambda$addScreenListener$0(view2, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addScreenListener$0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.nextTransition.isEmpty()) {
                return;
            }
            TabNavigatorObserver.this.mReaLayoutAnimator.getAnimationsManager().navigationTabChanged(this.nextTransition.get(0), this.nextTransition.get(1));
            this.nextTransition.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void onFragmentUpdate(androidx.fragment.app.Fragment r3, boolean r4) {
            /*
                r2 = this;
                boolean r0 = com.swmansion.reanimated.layoutReanimation.ScreensHelper.isScreenFragment(r3)
                if (r0 != 0) goto L7
                return
            L7:
                java.lang.reflect.Method r0 = r2.getScreen     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                r1 = 0
                java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                android.view.View r3 = (android.view.View) r3     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                java.lang.reflect.Method r0 = r2.getActivityState     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                java.lang.Object r0 = r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                if (r0 != 0) goto L19
                return
            L19:
                r2.addScreenListener(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                android.view.View r0 = r2.firstScreen     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                if (r0 != 0) goto L29
                r2.firstScreen = r3     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                return
            L23:
                r3 = move-exception
                goto L45
            L25:
                r3 = move-exception
                goto L45
            L27:
                r3 = move-exception
                goto L45
            L29:
                if (r4 == 0) goto L36
                java.util.List<android.view.View> r4 = r2.nextTransition     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                r4.add(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                java.util.List<android.view.View> r4 = r2.nextTransition     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                r4.add(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                goto L42
            L36:
                java.util.List<android.view.View> r4 = r2.nextTransition     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                r4.add(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                java.util.List<android.view.View> r3 = r2.nextTransition     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                android.view.View r4 = r2.firstScreen     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                r3.add(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
            L42:
                r2.firstScreen = r1     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.NullPointerException -> L25 java.lang.IllegalAccessException -> L27
                goto L4e
            L45:
                java.lang.String r4 = r3.getMessage()
                if (r4 == 0) goto L4e
                r3.getMessage()
            L4e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.reanimated.layoutReanimation.TabNavigatorObserver.FragmentLifecycleCallbacks.onFragmentUpdate(androidx.fragment.app.Fragment, boolean):void");
        }

        @Override // p000.AbstractC4060fY
        public void onFragmentAttached(AbstractC1733o abstractC1733o, Fragment fragment, Context context) {
            onFragmentUpdate(fragment, true);
        }

        @Override // p000.AbstractC4060fY
        public void onFragmentDetached(AbstractC1733o abstractC1733o, Fragment fragment) {
            onFragmentUpdate(fragment, false);
        }
    }

    public class OnAttachStateChangeListener implements View.OnAttachStateChangeListener {
        public OnAttachStateChangeListener() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            TabNavigatorObserver.this.mReaLayoutAnimator.getAnimationsManager().visitNativeTreeAndMakeSnapshot(view);
        }
    }

    public TabNavigatorObserver(ReaLayoutAnimator reaLayoutAnimator) {
        this.mReaLayoutAnimator = reaLayoutAnimator;
    }

    public void handleScreenContainerUpdate(View view) {
        try {
            Fragment fragment = (Fragment) view.getClass().getMethod("getFragment", null).invoke(view, null);
            int id = fragment.getId();
            if (this.mFragmentsWithListenerRegistry.contains(Integer.valueOf(id))) {
                return;
            }
            this.mFragmentsWithListenerRegistry.add(Integer.valueOf(id));
            fragment.getParentFragmentManager().m10052R(new FragmentLifecycleCallbacks(fragment));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            if (e.getMessage() != null) {
                e.getMessage();
            }
        }
    }
}
