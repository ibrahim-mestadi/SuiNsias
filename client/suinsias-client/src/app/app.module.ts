import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminAnnoncesComponent } from './components/admin-annonces/admin-annonces.component';
import { AdminAddComponent } from './components/admin-add/admin-add.component';
import { AdminMessageComponent } from './components/admin-message/admin-message.component';
import { AdminProfileComponent } from './components/admin-profile/admin-profile.component';
import { AnnoncedetailComponent } from './components/annoncedetail/annoncedetail.component';
import { MenubarComponent } from './components/menubar/menubar.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { AdminlayoutComponent } from './pages/adminlayout/adminlayout.component';
import { ContactComponent } from './pages/contact/contact.component';
import { HomeComponent } from './pages/home/home.component';
import { InformationComponent } from './pages/information/information.component';
import { LoginComponent } from './pages/login/login.component';
import { NotfoundComponent } from './pages/notfound/notfound.component';
import { SidbarComponent } from './components/sidbar/sidbar.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminAnnoncesComponent,
    AdminAddComponent,
    AdminMessageComponent,
    AdminProfileComponent,
    AnnoncedetailComponent,
    MenubarComponent,
    NavbarComponent,
    AdminlayoutComponent,
    ContactComponent,
    HomeComponent,
    InformationComponent,
    LoginComponent,
    NotfoundComponent,
    SidbarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
