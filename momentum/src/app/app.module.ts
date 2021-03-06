import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { FooterComponent } from './footer/footer.component';
import { SbrenosComponent } from './sbrenos/sbrenos.component';
import { ContatoComponent } from './contato/contato.component';
import { HttpClientModule } from '@angular/common/http';
import { UsuariosComponent } from './usuarios/usuarios.component';
import { FormularioComponent } from './formulario/formulario.component';
import { EditarComponent } from './editar/editar.component';
import { DeletarComponent } from './deletar/deletar.component';
import { FaqComponent } from './faq/faq.component';
import { AcolhimentoComponent } from './acolhimento/acolhimento.component';
import { EntrarComponent } from './entrar/entrar.component';
import { PerfilComponent } from './perfil/perfil.component';
import { FeedComponent } from './feed/feed.component';
import { OrderModule } from 'ngx-order-pipe';
import {NgxPaginationModule} from 'ngx-pagination';
import { EditarPostagemComponent } from './editar-postagem/editar-postagem.component';
import { ExcluirPostagemComponent } from './excluir-postagem/excluir-postagem.component';
import { PrivacidadeComponent } from './privacidade/privacidade.component';
import { ListaContatoComponent } from './lista-contato/lista-contato.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    FooterComponent,
    SbrenosComponent,
    ContatoComponent,
    UsuariosComponent,
    FormularioComponent,
    EditarComponent,
    DeletarComponent,
    AcolhimentoComponent,
    EntrarComponent,
    PerfilComponent,
    FeedComponent,
    EditarPostagemComponent,
    ExcluirPostagemComponent,
    PrivacidadeComponent,
    ListaContatoComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FontAwesomeModule,
    HttpClientModule,
    FormsModule,
    OrderModule,
    NgxPaginationModule
  ],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
