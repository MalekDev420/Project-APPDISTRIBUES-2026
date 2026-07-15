import { Routes } from '@angular/router';
import { Dashboard } from './pages/dashboard/dashboard';
import { Events } from './pages/events/events';
import { Reservations } from './pages/reservations/reservations';
import { Notifications } from './pages/notifications/notifications';
export const routes: Routes=[{path:'',component:Dashboard},{path:'events',component:Events},{path:'reservations',component:Reservations},{path:'notifications',component:Notifications},{path:'**',redirectTo:''}];
